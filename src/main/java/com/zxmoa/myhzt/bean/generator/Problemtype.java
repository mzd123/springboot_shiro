package com.zxmoa.myhzt.bean.generator;

public class Problemtype extends ProblemtypeKey {
    private String problemtypename;

    private String status;

    private String createuserid;

    private String modifyuserid;

    private String modifytime;

    private String createtime;

    public String getProblemtypename() {
        return problemtypename;
    }

    public void setProblemtypename(String problemtypename) {
        this.problemtypename = problemtypename == null ? null : problemtypename.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public String getModifyuserid() {
        return modifyuserid;
    }

    public void setModifyuserid(String modifyuserid) {
        this.modifyuserid = modifyuserid == null ? null : modifyuserid.trim();
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime == null ? null : modifytime.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }
}