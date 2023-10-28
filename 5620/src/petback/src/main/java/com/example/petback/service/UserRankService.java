package com.example.petback.service;

import com.example.petback.entity.EnergyUsage;
import com.example.petback.mapper.EnergyUsageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserRankService {
    @Autowired 
    private EnergyUsageMapper energyUsageMapper;
    
    public Map<String,Object> receiveusage(EnergyUsage energyUsage){
        System.out.println(energyUsage.getuserId());
        int result =energyUsageMapper.receive(energyUsage);
        if(result==1)
            return response_reason("success");
        else
            return response_reason("error");
    }

    public int sendusage(EnergyUsage energyUsage)
    {
        return energyUsageMapper.send(energyUsage);
    }

    private Map<String,Object>response_reason(String reason)
    {
        Map<String, Object> response = new HashMap<>();
        response.put("reason", reason);
        return response;
    }
}
