package com.example.petback.entity;

public class Education {
    private int educationId;
    private int userId;
    private String educationName;
    private String educationContent;

    public Education() {
    }

    public Education(int educationId, int userId, String educationName, String tag, String educationContent, String reason) {
        this.educationId = educationId;
        this.userId = userId;
        this.educationName = educationName;
        this.educationContent = educationContent;
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

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public String getEducationContent() {
        return educationContent;
    }

    public void setEducationContent(String educationContent) {
        this.educationContent = educationContent;
    }
}
