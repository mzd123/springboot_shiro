package com.zxmoa.myhzt.bean.generator;

public class LogWithBLOBs extends Log {
    private String paramsandvalues;

    private String remark;

    private String errormessage;

    public String getParamsandvalues() {
        return paramsandvalues;
    }

    public void setParamsandvalues(String paramsandvalues) {
        this.paramsandvalues = paramsandvalues == null ? null : paramsandvalues.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage == null ? null : errormessage.trim();
    }
}