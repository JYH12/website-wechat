package com.website.pojo;

import java.util.Date;

public class Announce {
    private Integer aid;

    private String announceTitle;

    private Date time;

    private String editor;

    private String announceContent;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAnnounceTitle() {
        return announceTitle;
    }

    public void setAnnounceTitle(String announceTitle) {
        this.announceTitle = announceTitle == null ? null : announceTitle.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public String getAnnounceContent() {
        return announceContent;
    }

    public void setAnnounceContent(String announceContent) {
        this.announceContent = announceContent == null ? null : announceContent.trim();
    }
}