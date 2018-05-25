package com.zxmoa.myhzt.bean.generator;

public class PublicKey {
    private String publicid;

    public String getPublicid() {
        return publicid;
    }

    public void setPublicid(String publicid) {
        this.publicid = publicid == null ? null : publicid.trim();
    }
}