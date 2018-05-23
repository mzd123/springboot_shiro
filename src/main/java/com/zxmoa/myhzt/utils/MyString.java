package com.zxmoa.myhzt.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class MyString {
    /**
     * 获取uuid
     *
     * @return
     */
    public static String getuuid() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "");
    }

    /**
     * 将String转化为int
     *
     * @param string
     * @param i
     * @return
     */
    public static int String2int(String string, int i) {
        if (StringUtils.isNotEmpty(string)) {
            try {
                i = Integer.valueOf(string);
                return i;
            } catch (NumberFormatException e) {
                return i;
            }
        }
        return i;
    }

    /**
     * 将object转换为String
     * 为了减少空指针异常
     *
     * @param object
     * @return
     */
    public static String Object2String(Object object) {
        return object == null ? "" : object.toString();
    }


    public static void main(String[] args) {
        System.out.println(getuuid());
    }
}
