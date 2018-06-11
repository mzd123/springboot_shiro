package com.zxmoa.myhzt.bean.generator;

public class JobKey {
    private String jobid;

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid == null ? null : jobid.trim();
    }
}