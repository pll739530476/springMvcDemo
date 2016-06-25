package com.springMvc.pll.repository;


import com.springMvc.pll.entity.User;

/**
 * Created by longlong.pan on 2016/6/23.
 */
public interface UserRepository {

    public User selectById(int id);
}
