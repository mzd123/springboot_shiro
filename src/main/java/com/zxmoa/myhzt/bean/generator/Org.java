package com.zxmoa.myhzt.bean.generator;

public class Org extends OrgKey {
    private String orgname;

    private String orgtypeid;

    private String iflxbm;

    private String orgno;

    private String status;

    private String createuserid;

    private String modifyuserid;

    private String modifytime;

    private String createtime;

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getOrgtypeid() {
        return orgtypeid;
    }

    public void setOrgtypeid(String orgtypeid) {
        this.orgtypeid = orgtypeid == null ? null : orgtypeid.trim();
    }

    public String getIflxbm() {
        return iflxbm;
    }

    public void setIflxbm(String iflxbm) {
        this.iflxbm = iflxbm == null ? null : iflxbm.trim();
    }

    public String getOrgno() {
        return orgno;
    }

    public void setOrgno(String orgno) {
        this.orgno = orgno == null ? null : orgno.trim();
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