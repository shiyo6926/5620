package com.example.petback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petback.entity.Feedback;
import com.example.petback.mapper.FeedbackMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FeedbackService {
    @Autowired FeedbackMapper feedbackMapper;
    public Map<String,Object> receivefeedback(Feedback feedback){
        int result =feedbackMapper.receive(feedback);
        if(result==1)
            return response_reason("success");
        else
            return response_reason("error");
    }

    public Map<Integer, Feedback> sendfeedback(Feedback feedback)
    {
        List<Feedback> feedbacklist=feedbackMapper.send(feedback);
        Map<Integer, Feedback> FeedbackMap = new HashMap<>();
        for (Feedback ed : feedbacklist) {
            FeedbackMap.put(ed.getuserId(), ed);
        }
        return FeedbackMap;
    }

    private Map<String, Object> response_reason(String reason) {
        Map<String, Object> response = new HashMap<>();
        response.put("reason", reason);
        return response;
    }

    public Map<String, Object> receivefeedbackstatus(Feedback feedback){
        int result = feedbackMapper.update(feedback);
        if(result==1)
            return response_reason("success");
        else
            return response_reason("error");
    }
    public Map<Integer, Feedback> sendfeedbackstatus(Feedback feedback){
        List<Feedback> feedbacklist=feedbackMapper.sendfeedbackstatus(feedback);
        Map<Integer, Feedback> FeedbackStatusMap = new HashMap<>();
        for (Feedback ed : feedbacklist) {
            FeedbackStatusMap.put(ed.getuserId(), ed);
        }
        return FeedbackStatusMap;
    }

}
