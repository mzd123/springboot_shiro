package com.zxmoa.myhzt.bean.generator;

public class Complaints extends ComplaintsKey {
    private String riverid;

    private String fromusername;

    private String tel;

    private String createtime;

    private String modifytime;

    private String status;

    public String getRiverid() {
        return riverid;
    }

    public void setRiverid(String riverid) {
        this.riverid = riverid == null ? null : riverid.trim();
    }

    public String getFromusername() {
        return fromusername;
    }

    public void setFromusername(String fromusername) {
        this.fromusername = fromusername == null ? null : fromusername.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime == null ? null : modifytime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}