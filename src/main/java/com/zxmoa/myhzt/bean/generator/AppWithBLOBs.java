package com.zxmoa.myhzt.bean.generator;

public class AppWithBLOBs extends App {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}