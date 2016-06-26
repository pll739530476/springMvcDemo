package com.springMvc.pll.repository;


import com.springMvc.pll.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by longlong.pan on 2016/6/23.
 */

public interface StudentRepository {
    public Student selectById(int id);

}
