package com.zxmoa.myhzt.bean.generator;

public class MessageKey {
    private String messageid;

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid == null ? null : messageid.trim();
    }
}