package com.chenxr1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 重新做人idea基础学习
 * @date 2020-7-01
 */


@Controller
public class RequsetMappingController {
    @RequestMapping(value = "/login")
    public String login(){
        return  "login";
    }
    @RequestMapping(value ="/register")
    public String register() {
        return  "register";
    }
}
