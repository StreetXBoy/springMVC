package com.chenxr1.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 重新做人idea基础学习
 * @date 2020-7-01
 */

@Component
public class UserDao {
    private String name;
    private int id;
    @Autowired
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Autowired
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "user_name: "+name+"userid: "+id;
    }
}
