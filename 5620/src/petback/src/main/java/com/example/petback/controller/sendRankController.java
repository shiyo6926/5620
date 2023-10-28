package com.example.petback.controller;

import com.example.petback.entity.EnergyUsage;
import com.example.petback.service.UserRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sendrank")
public class sendRankController {
    @Autowired
    private UserRankService userRankService;
    @PostMapping
    public int receive(@RequestBody EnergyUsage energyUsage) {

        return userRankService.sendusage(energyUsage);
    }
}
