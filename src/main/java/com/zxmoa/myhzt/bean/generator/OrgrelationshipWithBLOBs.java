package com.zxmoa.myhzt.bean.generator;

public class OrgrelationshipWithBLOBs extends Orgrelationship {
    private String orgpath;

    public String getOrgpath() {
        return orgpath;
    }

    public void setOrgpath(String orgpath) {
        this.orgpath = orgpath == null ? null : orgpath.trim();
    }
}