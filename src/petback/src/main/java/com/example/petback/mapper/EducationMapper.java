package com.example.petback.mapper;

import com.example.petback.entity.Education;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface EducationMapper {
    @Select("SELECT * FROM education")
    List<Education> getEducations();
}
