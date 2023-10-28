package com.example.petback.entity;

public class Feedback {
    private int feedbackId;
    private int userId; 
    private String feedback;
    private String status;
    
    public int getuserId(){
        return userId;
    }
    public int getfeedbackId(){
        return feedbackId;
    }
    public String getfeedback(){
        return feedback;
    }
    public String getstatus(){
        return status;
    }
    public void setstatus(String status){
        this.status = status;
    }
    public void setfeedbackId(int feedbackId){
        this.feedbackId = feedbackId;
    }
    public void setfeedback(String feedback){
        this.feedback = feedback;
    }
}
