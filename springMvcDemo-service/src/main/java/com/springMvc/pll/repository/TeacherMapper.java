package com.springMvc.pll.repository;

import com.springMvc.pll.entity.Teacher;

public interface TeacherMapper {
    int insert(Teacher record);

    int insertSelective(Teacher record);
}