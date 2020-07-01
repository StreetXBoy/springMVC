package com.chenxr1.controller;

import com.chenxr1.Service.UserService;
import com.chenxr1.annotion.Myautowired;

/**
 * @author 重新做人idea基础学习
 * @date 2020-7-01
 */
public class UserController {
    @Myautowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
