package com.example.petback.entity;

public class SocialSharing {
    private int sharingId;
    private int userId;
    private String sharingContent;

    private String userName;
    private String reason;

    // Constructors, getters, and setters

    public SocialSharing() {
    }

    public SocialSharing(int sharingId, int userId, String sharingContent, String userName, String reason) {
        this.sharingId = sharingId;
        this.userId = userId;
        this.sharingContent = sharingContent;
        this.userName = userName;
        this.reason = reason;
    }

    public int getSharingId() {
        return sharingId;
    }

    public void setSharingId(int sharingId) {
        this.sharingId = sharingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSharingContent() {
        return sharingContent;
    }

    public void setSharingContent(String sharingContent) {
        this.sharingContent = sharingContent;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}