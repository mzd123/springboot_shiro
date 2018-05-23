package com.zxmoa.myhzt.bean.generator;

public class UserKey {
    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}