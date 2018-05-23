package com.zxmoa.myhzt.bean.extend.log;

public class LogExtend {
    private String logid;

    private String method;

    private String username;

    private String location;

    private String ip;

    private String createtime;

    private String ifsuccess;

    private String duration;

    private String paramsandvalues;

    private String remark;
    private String errormessage;

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getIfsuccess() {
        return ifsuccess;
    }

    public void setIfsuccess(String ifsuccess) {
        this.ifsuccess = ifsuccess;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getParamsandvalues() {
        return paramsandvalues;
    }

    public void setParamsandvalues(String paramsandvalues) {
        this.paramsandvalues = paramsandvalues;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }
}
