package com.example.petback.controller;

import com.example.petback.entity.EnergyUsage;
import com.example.petback.service.UserRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/receiveachievement")
public class receiveAchievementController {
    @Autowired
    private UserRankService userRankService;
    @PostMapping
    public Map<String, Object> receive(@RequestBody EnergyUsage energyUsage) {

        return userRankService.receiveusage(energyUsage);
    }
}
