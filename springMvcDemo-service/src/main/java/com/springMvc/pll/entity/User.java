package com.springMvc.pll.entity;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * Created by longlong.pan on 2016/6/23.
 */

public class User {
    private  String name;
    private  Integer id;
    private  Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
