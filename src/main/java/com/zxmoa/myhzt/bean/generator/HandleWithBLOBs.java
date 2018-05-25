package com.zxmoa.myhzt.bean.generator;

public class HandleWithBLOBs extends Handle {
    private String touserid;

    private String toorgid;

    private String content;

    private String result;

    private String resultfiles;

    public String getTouserid() {
        return touserid;
    }

    public void setTouserid(String touserid) {
        this.touserid = touserid == null ? null : touserid.trim();
    }

    public String getToorgid() {
        return toorgid;
    }

    public void setToorgid(String toorgid) {
        this.toorgid = toorgid == null ? null : toorgid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getResultfiles() {
        return resultfiles;
    }

    public void setResultfiles(String resultfiles) {
        this.resultfiles = resultfiles == null ? null : resultfiles.trim();
    }
}