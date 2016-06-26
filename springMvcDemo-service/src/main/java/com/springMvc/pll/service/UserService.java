package com.springMvc.pll.service;


import com.springMvc.pll.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by longlong.pan on 2016/6/23.
 */

public interface UserService {
    public User selectById(int id);
}
