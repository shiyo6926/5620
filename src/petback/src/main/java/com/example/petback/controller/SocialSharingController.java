package com.example.petback.controller;

import com.example.petback.entity.SocialSharing;
import com.example.petback.service.SocialSharingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/socialsharing")
public class SocialSharingController {

    @Autowired
    private SocialSharingService socialSharingService;


    @PostMapping("/add")
    public SocialSharing addSocialSharing(
            @RequestBody SocialSharing socialsharing) {
        SocialSharing response =socialSharingService.addSocialSharing(socialsharing);
        return response;
    }

    @PostMapping("/edit")
    public SocialSharing editSocialSharing(
            @RequestBody SocialSharing socialsharing) {
        SocialSharing response = socialSharingService.editSocialSharing(socialsharing);
        return response;
    }

    @PostMapping("/delete")
    public SocialSharing deleteSocialSharing(
            @RequestBody SocialSharing socialsharing) {
        SocialSharing response = socialSharingService.deleteSocialSharing(socialsharing);
        return response;
    }

    @PostMapping("/getbyUser")
    public ResponseEntity<List<SocialSharing>> getSocialSharingByuserId(@RequestBody SocialSharing socialsharing) {

        List<SocialSharing> socialSharing = socialSharingService.getSocialSharingByuserId(socialsharing.getUserId());
        return ResponseEntity.ok(socialSharing);
    }
    @GetMapping("/get")
    public ResponseEntity<List<SocialSharing>> getSocialSharings() {

        List<SocialSharing> socialsharings = socialSharingService.getSocialSharings();
        return ResponseEntity.ok(socialsharings);
    }
}
