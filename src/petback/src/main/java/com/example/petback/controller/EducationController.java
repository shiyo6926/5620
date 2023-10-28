package com.example.petback.controller;

import com.example.petback.entity.Education;
import com.example.petback.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/geteducation")
public class EducationController {
    @Autowired
    private EducationService educationService;
    @GetMapping
    public ResponseEntity<List<Education>> getEducations() {

        List<Education> educations = educationService.getEducations();
        return ResponseEntity.ok(educations);
    }
}
