package com.zxmoa.myhzt.bean.generator;

public class UserWithBLOBs extends User {
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}