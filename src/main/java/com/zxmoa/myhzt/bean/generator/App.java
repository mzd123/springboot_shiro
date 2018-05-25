package com.zxmoa.myhzt.bean.generator;

public class App extends AppKey {
    private String apptype;

    private String version;

    private String plist;

    private String ifforce;

    private String createtime;

    private String createuserid;

    private String status;

    public String getApptype() {
        return apptype;
    }

    public void setApptype(String apptype) {
        this.apptype = apptype == null ? null : apptype.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getPlist() {
        return plist;
    }

    public void setPlist(String plist) {
        this.plist = plist == null ? null : plist.trim();
    }

    public String getIfforce() {
        return ifforce;
    }

    public void setIfforce(String ifforce) {
        this.ifforce = ifforce == null ? null : ifforce.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}