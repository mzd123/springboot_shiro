package com.zxmoa.myhzt.bean.generator;

public class ProblemtypeWithBLOBs extends Problemtype {
    private String problemtyperemark;

    public String getProblemtyperemark() {
        return problemtyperemark;
    }

    public void setProblemtyperemark(String problemtyperemark) {
        this.problemtyperemark = problemtyperemark == null ? null : problemtyperemark.trim();
    }
}