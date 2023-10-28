package com.example.petback.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petback.entity.Feedback;
import com.example.petback.service.FeedbackService;

@RestController
@RequestMapping("/sendFeedback")
public class sendFeedbackController {
    @Autowired
    private FeedbackService feedbackService;
    @GetMapping
    public Map<Integer, Feedback> send(Feedback feedback) {

        return feedbackService.sendfeedback(feedback);
    }
}
