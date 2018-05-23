package com.zxmoa.myhzt.config.aop;

import com.zxmoa.myhzt.common.annotation.RequestTimes;
import com.zxmoa.myhzt.common.exception.MyException;
import com.zxmoa.myhzt.constant.Common;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

//使用@Aspect注解将一个java类定义为切面类
@Aspect
@Component
public class RequestTimesAop {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Pointcut("execution(public * com.zxmoa.myhzt.controller.*.*(..))")
    public void WebPointCut() {
    }

    @Around("WebPointCut() && @annotation(requestTimes)")
    /**
     * JoinPoint对象封装了SpringAop中切面方法的信息,在切面方法中添加JoinPoint参数,就可以获取到封装了该方法信息的JoinPoint对象.
     */
    public Object ifovertimes(ProceedingJoinPoint joinPoint, RequestTimes requestTimes) {
        Object result = null;
        try {
            //java.lang.Object[] getArgs()：获取连接点方法运行时的入参列表；
            //Signature getSignature() ：获取连接点的方法签名对象；
            //java.lang.Object getTarget() ：获取连接点所在的目标对象；
            //java.lang.Object getThis() ：获取代理对象本身；
            //####################################################################
            /**
             * 比如：获取连接点方法运行时的入参列表
             *  不足：如果连接点方法中没有request参数的话，就没法获取request，如果不做处理的话，会报空指针异常的
             *  但是所有请求怎么可能没有request
             */
//            Object[] objects = joinPoint.getArgs();
//            HttpServletRequest request = null;
//            for (int i = 0; i < objects.length; i++) {
//                if (objects[i] instanceof HttpServletRequest) {
//                    request = (HttpServletRequest) objects[i];
//                    break;
//                }
//            }
            //####################################################################
            /**
             * 另一种获取request
             */
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            HttpServletResponse response = attributes.getResponse();
            String ip = request.getRemoteAddr();
            String url = request.getRequestURL().toString();
            String key = "ifovertimes".concat(url).concat(ip);
            //访问次数加一
            long count = redisTemplate.opsForValue().increment(key, 1);
            //如果是第一次，则设置过期时间
            if (count == 1) {
                redisTemplate.expire(key, requestTimes.time(), TimeUnit.MILLISECONDS);
            }
            if (count > requestTimes.count()) {
                //如果超过访问次数，就不执行controller
                request.getRequestDispatcher("/OverTimeRequest.do").forward(request, response);
            } else {
                //执行controller层
                result = joinPoint.proceed();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }
}
