package com.zxmoa.myhzt.bean.generator;

public class MenuKey {
    private String menuid;

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }
}