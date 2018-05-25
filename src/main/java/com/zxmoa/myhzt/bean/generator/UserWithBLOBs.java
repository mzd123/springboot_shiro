package com.zxmoa.myhzt.bean.generator;

public class UserWithBLOBs extends User {
    private String remark;

    private String eps;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps == null ? null : eps.trim();
    }
}