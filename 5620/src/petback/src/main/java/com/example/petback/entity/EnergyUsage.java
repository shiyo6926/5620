package com.example.petback.entity;
import java.util.Date;

public class EnergyUsage {
    private Integer userId;
    private Integer energyUsageId;
    private Float usage;
    private Date date;

    public Float getusage(){
        return usage;
    }
    public Integer getuserId(){
        return userId;
    }
    public Integer getenergyUsageId(){
        return energyUsageId;
    }
    public void setusage(Float usage){
        this.usage = usage;
    }
    public void setenergyUsageID(int energyUsageId){
        this.energyUsageId = energyUsageId;
    }
    public Date getdate(){
        return date;
    }
}
