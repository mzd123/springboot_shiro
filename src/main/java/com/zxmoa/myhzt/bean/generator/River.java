package com.zxmoa.myhzt.bean.generator;

public class River extends RiverKey {
    private String rivername;

    private String riveralias;

    private String riverno;

    private String riverlength;

    private String orgid;

    private String lxbm;

    private String startpoint;

    private String endpoint;

    private String createuserid;

    private String modifyuserid;

    private String modifytime;

    private String createtime;

    private String status;

    public String getRivername() {
        return rivername;
    }

    public void setRivername(String rivername) {
        this.rivername = rivername == null ? null : rivername.trim();
    }

    public String getRiveralias() {
        return riveralias;
    }

    public void setRiveralias(String riveralias) {
        this.riveralias = riveralias == null ? null : riveralias.trim();
    }

    public String getRiverno() {
        return riverno;
    }

    public void setRiverno(String riverno) {
        this.riverno = riverno == null ? null : riverno.trim();
    }

    public String getRiverlength() {
        return riverlength;
    }

    public void setRiverlength(String riverlength) {
        this.riverlength = riverlength == null ? null : riverlength.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getLxbm() {
        return lxbm;
    }

    public void setLxbm(String lxbm) {
        this.lxbm = lxbm == null ? null : lxbm.trim();
    }

    public String getStartpoint() {
        return startpoint;
    }

    public void setStartpoint(String startpoint) {
        this.startpoint = startpoint == null ? null : startpoint.trim();
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint == null ? null : endpoint.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}