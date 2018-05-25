package com.zxmoa.myhzt.bean.generator;

public class AppKey {
    private String appid;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }
}