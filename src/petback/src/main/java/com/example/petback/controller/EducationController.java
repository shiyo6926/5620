package com.example.petback.controller;

import com.example.petback.entity.Education;
import com.example.petback.service.EducationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/geteducation")
public class EducationController {
    private EducationService educationService;
    public ResponseEntity<List<Education>> getEducations() {

        List<Education> educations = educationService.getEducations();
        return ResponseEntity.ok(educations);
    }
}
