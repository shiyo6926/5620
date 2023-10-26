package com.example.petback.service;

import com.example.petback.entity.Education;
import com.example.petback.mapper.EducationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EducationService {

    @Autowired
    private EducationMapper educationMapper;
    public List<Education> getEducations() {
        // 检查参数是否为空
        List<Education> list =new ArrayList<>();;

        // 调用 Mapper 获取数据
        return educationMapper.getEducations();
    }
}
