package com.springMvc.pll.service.impl;


import com.springMvc.pll.entity.Student;
import com.springMvc.pll.entity.User;
import com.springMvc.pll.repository.StudentRepository;
import com.springMvc.pll.repository.UserRepository;
import com.springMvc.pll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by longlong.pan on 2016/6/23.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    public User selectById(int id) {
        return userRepository.selectById(id);
    }

}
