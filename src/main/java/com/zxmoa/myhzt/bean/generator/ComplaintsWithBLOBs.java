package com.zxmoa.myhzt.bean.generator;

public class ComplaintsWithBLOBs extends Complaints {
    private String complaintscontent;

    public String getComplaintscontent() {
        return complaintscontent;
    }

    public void setComplaintscontent(String complaintscontent) {
        this.complaintscontent = complaintscontent == null ? null : complaintscontent.trim();
    }
}