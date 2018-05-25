package com.zxmoa.myhzt.bean.generator;

public class AnnouncementWithBLOBs extends Announcement {
    private String announcementtitle;

    private String announcementidcontent;

    public String getAnnouncementtitle() {
        return announcementtitle;
    }

    public void setAnnouncementtitle(String announcementtitle) {
        this.announcementtitle = announcementtitle == null ? null : announcementtitle.trim();
    }

    public String getAnnouncementidcontent() {
        return announcementidcontent;
    }

    public void setAnnouncementidcontent(String announcementidcontent) {
        this.announcementidcontent = announcementidcontent == null ? null : announcementidcontent.trim();
    }
}