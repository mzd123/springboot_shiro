package com.zxmoa.myhzt.config.aop;

import com.zxmoa.myhzt.bean.generator.LogWithBLOBs;
import com.zxmoa.myhzt.common.annotation.Log;
import com.zxmoa.myhzt.common.exception.MyException;
import com.zxmoa.myhzt.constant.Common;
import com.zxmoa.myhzt.service.CommonService;
import com.zxmoa.myhzt.utils.IpUtils;
import com.zxmoa.myhzt.utils.MyString;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

//使用@Aspect注解将一个java类定义为切面类
@Aspect
@Component
public class WebAop {

    @Autowired
    private CommonService commonService;
    private final Logger logger = LoggerFactory.getLogger(WebAop.class);

    /**
     * 使用@Pointcut定义一个切入点，可以是一个规则表达式，比如某个package下的所有函数，也可以是一个注解等
     */
    //两个..代表所有子目录，最后括号里的两个..代表所有参数
    @Pointcut("execution(public * com.zxmoa.myhzt.service.*.select*(..))" +
            "||execution(public * com.zxmoa.myhzt.service.*.insert*(..))" +
            "||execution(public * com.zxmoa.myhzt.service.*.update*(..))" +
            "||execution(public * com.zxmoa.myhzt.service.*.delete*(..))"+
            "||execution(public * com.zxmoa.myhzt.service.*.login*(..))"
    )
    public void WebPointCut() {
    }


    @Around("WebPointCut()")
    public Object around(ProceedingJoinPoint point) throws MyException {
        Object result = null;
        long beginTime = System.currentTimeMillis();
        try {
            result = point.proceed();
        } catch (Throwable e) {
            logger.error(e.toString());
            saveLog(point, 0, Common.fail, e.toString());
            //抛出异常，让controller去捕获
            throw new MyException();
        }
        long time = System.currentTimeMillis() - beginTime;
        saveLog(point, time, Common.success, "");
        return result;
    }

    private void saveLog(ProceedingJoinPoint joinPoint, long time, String ifsuccess, String errormessage) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        LogWithBLOBs log = new LogWithBLOBs();
        log.setLogid(MyString.getuuid());
        Log logAnnotation = method.getAnnotation(Log.class);
        if (logAnnotation != null) {
            //备注
            log.setRemark(logAnnotation.value());
        }
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        log.setMethod(className + "." + methodName + "()");
        Object[] args = joinPoint.getArgs();
        LocalVariableTableParameterNameDiscoverer u = new LocalVariableTableParameterNameDiscoverer();
        String[] paramNames = u.getParameterNames(method);
        if (args != null && paramNames != null) {
            String params = "";
            for (int i = 0; i < args.length; i++) {
                params += "  " + paramNames[i] + ": " + (args[i].equals("") ? "-" : args[i]) + ";";
            }
            log.setParamsandvalues(params);
        }
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        log.setIp(IpUtils.getIp(request));
        log.setUserid("11111111111111111111111111111111");
        log.setDuration(String.valueOf(time));
        log.setCreatetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        log.setIfsuccess(ifsuccess);
        log.setLocation(IpUtils.getRealAddressByIP(log.getIp()));
        log.setErrormessage(errormessage);
        commonService.save_log(log);
    }
}
