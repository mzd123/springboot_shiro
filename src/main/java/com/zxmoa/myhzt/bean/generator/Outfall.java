package com.zxmoa.myhzt.bean.generator;

public class Outfall extends OutfallKey {
    private String outfallname;

    private String outfalltypeid;

    private String riverid;

    private String outfallno;

    private String lat;

    private String lng;

    private String fallmethod;

    private String inrivermethod;

    private String status;

    private String createuserid;

    private String modifyuserid;

    private String modifytime;

    private String createtime;

    public String getOutfallname() {
        return outfallname;
    }

    public void setOutfallname(String outfallname) {
        this.outfallname = outfallname == null ? null : outfallname.trim();
    }

    public String getOutfalltypeid() {
        return outfalltypeid;
    }

    public void setOutfalltypeid(String outfalltypeid) {
        this.outfalltypeid = outfalltypeid == null ? null : outfalltypeid.trim();
    }

    public String getRiverid() {
        return riverid;
    }

    public void setRiverid(String riverid) {
        this.riverid = riverid == null ? null : riverid.trim();
    }

    public String getOutfallno() {
        return outfallno;
    }

    public void setOutfallno(String outfallno) {
        this.outfallno = outfallno == null ? null : outfallno.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getFallmethod() {
        return fallmethod;
    }

    public void setFallmethod(String fallmethod) {
        this.fallmethod = fallmethod == null ? null : fallmethod.trim();
    }

    public String getInrivermethod() {
        return inrivermethod;
    }

    public void setInrivermethod(String inrivermethod) {
        this.inrivermethod = inrivermethod == null ? null : inrivermethod.trim();
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