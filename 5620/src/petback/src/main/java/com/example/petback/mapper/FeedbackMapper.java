package com.example.petback.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.petback.entity.Feedback;

import java.util.List;
@Mapper
public interface FeedbackMapper {
    @Insert("INSERT INTO feedback(userId,feedbackId,feedback) VALUES (#{userId},#{feedbackId},#{feedback})")
    int receive(Feedback feedback);
    @Select("SELECT * FROM feedback")
    List<Feedback> send(Feedback feedback);
    @Update("UPDATE feedback SET status= #{status} where feedbackId = #{feedbackId} ")
    int update(Feedback feedback);
    @Select("SELECT status FROM feedback WHERE feedbackId = #{feedbackId}")
    List<Feedback> sendfeedbackstatus(Feedback feedback);
}
