package com.zxmoa.myhzt.bean.generator;

public class RiverrelationshipWithBLOBs extends Riverrelationship {
    private String riverpath;

    public String getRiverpath() {
        return riverpath;
    }

    public void setRiverpath(String riverpath) {
        this.riverpath = riverpath == null ? null : riverpath.trim();
    }
}