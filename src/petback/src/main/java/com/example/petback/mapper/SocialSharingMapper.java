package com.example.petback.mapper;

import com.example.petback.entity.Education;
import com.example.petback.entity.SocialSharing;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface SocialSharingMapper {

    @Insert("INSERT INTO socialsharing (userId, sharingContent) VALUES (#{userId}, #{sharingContent})")
    void addSocialSharing(SocialSharing socialSharing);
    @Select("SELECT * FROM socialsharing WHERE userId = #{userId} AND sharingContent = #{sharingContent}")
    List<SocialSharing> getSocialSharingList(SocialSharing socialSharing);
    @Update("UPDATE socialsharing SET sharingContent = #{sharingContent} WHERE sharingId = #{sharingId}")
    void updateSocialSharing(SocialSharing socialSharing);

    @Delete("DELETE FROM socialsharing WHERE sharingId = #{sharingId} AND userId = #{userId}")
    void deleteSocialSharing(SocialSharing socialSharing);

    @Select("SELECT * FROM socialsharing WHERE userId = #{userId}")
    List<SocialSharing> getSocialSharingByuserId(int userId);

    @Select("SELECT * FROM socialsharing")
    List<SocialSharing> getSocialSharings();
}
