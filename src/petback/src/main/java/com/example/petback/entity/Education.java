package com.example.petback.entity;

public class Education {
    private int educationId;
    private String educationName;
    private String educationContent;

    public Education() {
    }

    public Education(int educationId, String educationName, String educationContent) {
        this.educationId = educationId;
        this.educationName = educationName;
        this.educationContent = educationContent;
    }

    public int getEducationId() {
        return educationId;
    }

    public void setEducationId(int educationId) {
        this.educationId = educationId;
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
