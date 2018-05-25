package com.zxmoa.myhzt.bean.generator;

public class OrgKey {
    private String orgid;

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }
}