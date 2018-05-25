package com.zxmoa.myhzt.bean.generator;

public class RiverKey {
    private String riverid;

    public String getRiverid() {
        return riverid;
    }

    public void setRiverid(String riverid) {
        this.riverid = riverid == null ? null : riverid.trim();
    }
}