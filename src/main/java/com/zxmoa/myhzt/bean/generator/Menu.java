package com.zxmoa.myhzt.bean.generator;

public class Menu extends MenuKey {
    private String parentid;

    private Integer myorder;

    private String menuname;

    private String perms;

    private String status;

    private String createuserid;

    private String modifyuserid;

    private String modifytime;

    private String createtime;

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public Integer getMyorder() {
        return myorder;
    }

    public void setMyorder(Integer myorder) {
        this.myorder = myorder;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms == null ? null : perms.trim();
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

    @Override
    public String toString() {
        return "Menu{" +
                "parentid='" + parentid + '\'' +
                ", myorder=" + myorder +
                ", menuname='" + menuname + '\'' +
                ", perms='" + perms + '\'' +
                ", status='" + status + '\'' +
                ", createuserid='" + createuserid + '\'' +
                ", modifyuserid='" + modifyuserid + '\'' +
                ", modifytime='" + modifytime + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }
}