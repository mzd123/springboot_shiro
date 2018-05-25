package com.zxmoa.myhzt.bean.generator;

public class OutfallWithBLOBs extends Outfall {
    private String from;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }
}