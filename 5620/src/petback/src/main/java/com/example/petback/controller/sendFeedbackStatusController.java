package com.example.petback.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petback.entity.Feedback;
import com.example.petback.service.FeedbackService;

@RestController
@RequestMapping("/sendfeedbackstatus")
public class sendFeedbackStatusController {
    @Autowired
    private FeedbackService feedbackService;
    @PostMapping
    public Map<Integer, Feedback> receive(@RequestBody Feedback feedback) {

        return feedbackService.sendfeedbackstatus(feedback);
    }
}
