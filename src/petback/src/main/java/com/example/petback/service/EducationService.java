package com.example.petback.service;

import com.example.petback.entity.Education;
import com.example.petback.mapper.EducationMapper;

import java.util.ArrayList;
import java.util.List;

public class EducationService {
    private EducationMapper educationMapper;
    public List<Education> getEducations() {
        // 检查参数是否为空
        List<Education> list =new ArrayList<>();;

        // 调用 Mapper 获取数据
        return educationMapper.getEducations();
    }
}
