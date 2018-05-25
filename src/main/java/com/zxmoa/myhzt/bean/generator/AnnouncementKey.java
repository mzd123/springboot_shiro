package com.zxmoa.myhzt.bean.generator;

public class AnnouncementKey {
    private String announcementid;

    public String getAnnouncementid() {
        return announcementid;
    }

    public void setAnnouncementid(String announcementid) {
        this.announcementid = announcementid == null ? null : announcementid.trim();
    }
}