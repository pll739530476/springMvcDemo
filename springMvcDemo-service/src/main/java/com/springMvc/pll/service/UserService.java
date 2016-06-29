package com.springMvc.pll.service;


import com.springMvc.pll.entity.User;

import java.util.List;

/**
 * Created by longlong.pan on 2016/6/23.
 */

public interface UserService {
    public List<User> selectById(int id);
}
