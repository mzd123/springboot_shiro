package com.zxmoa.myhzt.config.converter;

import com.zxmoa.myhzt.bean.common.ConverterBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 这个转换器在这里是没什么用的，spring的存在使得这个反射赋值没有什么意义
 * 但是时间格式转换之类的转换还是有意义的
 */
@Component
public class Converter4ConverterBean implements Converter<String, ConverterBean> {

    @Override
    public ConverterBean convert(String s) {
        ConverterBean converterBean = new ConverterBean();
        if (StringUtils.isNotEmpty(s)) {
            String[] string = s.split(";");
            for (String parm : string) {
                try {
                    String[] parms = parm.split("-");
                    String key = parms[0];
                    String value = parms[1];
                    //将参数的第一个字母变成大写，其他的都是小写
                    key = key.toLowerCase();
                    key = key.substring(0, 1).toUpperCase() + key.substring(1);
                    String methodname = "set" + key;
                    //调用反射
                    Class c = converterBean.getClass();
                    Method method = c.getDeclaredMethod(methodname, new Class[]{String.class});
                    // 设置访问私有方法的权限,虽然这里用不到
                    method.setAccessible(true);
                    method.invoke(converterBean, value);
                } catch (Exception e) {
                    continue;
                }
            }
        }
        return converterBean;
    }
}
