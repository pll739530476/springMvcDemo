package com.springMvc.pll.service.impl;


import com.springMvc.pll.entity.User;
import com.springMvc.pll.repository.UserMapper;
import com.springMvc.pll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by longlong.pan on 2016/6/23.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> selectById(int id) {
        return userMapper.selectAll();
    }

}
