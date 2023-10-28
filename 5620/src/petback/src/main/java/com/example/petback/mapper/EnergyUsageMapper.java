package com.example.petback.mapper;

import com.example.petback.entity.EnergyUsage;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface EnergyUsageMapper {
    @Insert("INSERT INTO energyusage(userId, `usage`) VALUES (#{userId},#{usage})")
    int receive(EnergyUsage energyUsage);
    @Select("WITH TodaySpecificUsage AS ( SELECT `usage` AS specific_usage FROM energyusage WHERE userId = #{userId} AND DATE(`date`) = CURDATE()), OtherUsersMonthlyUsage AS (SELECT MIN(`usage`) as `usage`,userId FROM energyusage WHERE `date` >= CURDATE() - INTERVAL 1 MONTH AND userId != #{userId} GROUP BY userId) SELECT COUNT(*) + 1 AS user_rank FROM TodaySpecificUsage, OtherUsersMonthlyUsage WHERE OtherUsersMonthlyUsage.usage < TodaySpecificUsage.specific_usage")
    int send(EnergyUsage energyUsage);
}
