package com.example.petback.entity;

public class Education {
    private int educationId;
    private int userId;
    private String educationName;
    private String tag;
    private String educationContent;
    private String reason;

    public Education() {
    }

    public Education(int educationId, int userId, String educationName, String tag, String educationContent, String reason) {
        this.educationId = educationId;
        this.userId = userId;
        this.educationName = educationName;
        this.tag = tag;
        this.educationContent = educationContent;
        this.reason = reason;
    }

    public int getEducationId() {
        return educationId;
    }

    public void setEducationId(int educationId) {
        this.educationId = educationId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProductName() {
        return educationName;
    }

    public void setProductName(String educationName) {
        this.educationName = educationName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getProductInformation() {
        return educationContent;
    }

    public void setProductInformation(String educationContent) {
        this.educationContent = educationContent;
    }
}
