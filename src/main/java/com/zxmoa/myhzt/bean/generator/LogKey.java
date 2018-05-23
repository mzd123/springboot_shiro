package com.zxmoa.myhzt.bean.generator;

public class LogKey {
    private String logid;

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
    }
}