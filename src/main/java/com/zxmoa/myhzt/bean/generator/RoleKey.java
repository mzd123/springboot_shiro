package com.zxmoa.myhzt.bean.generator;

public class RoleKey {
    private String roleid;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }
}