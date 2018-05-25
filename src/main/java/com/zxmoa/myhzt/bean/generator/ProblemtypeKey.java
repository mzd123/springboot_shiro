package com.zxmoa.myhzt.bean.generator;

public class ProblemtypeKey {
    private String problemtypeid;

    public String getProblemtypeid() {
        return problemtypeid;
    }

    public void setProblemtypeid(String problemtypeid) {
        this.problemtypeid = problemtypeid == null ? null : problemtypeid.trim();
    }
}