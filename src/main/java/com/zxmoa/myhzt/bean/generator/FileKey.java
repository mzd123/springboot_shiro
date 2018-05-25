package com.zxmoa.myhzt.bean.generator;

public class FileKey {
    private String fileid;

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }
}