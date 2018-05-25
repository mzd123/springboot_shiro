package com.zxmoa.myhzt.bean.generator;

public class Orgtype extends OrgtypeKey {
    private String orgtypename;

    private String status;

    public String getOrgtypename() {
        return orgtypename;
    }

    public void setOrgtypename(String orgtypename) {
        this.orgtypename = orgtypename == null ? null : orgtypename.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}