package com.chenxr1.test;

import com.chenxr1.Service.UserService;
import com.chenxr1.controller.UserController;

import javax.lang.model.SourceVersion;
import javax.lang.model.element.VariableElement;
import javax.xml.bind.SchemaOutputResolver;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 重新做人idea基础学习
 * @date 2020-7-01
 */
public class Test {
    public static void main(String[] args) throws Exception{
        UserService userService=new UserService();
        UserController userController=new UserController();
        //获取class
        Class<? extends UserController> clazz=userController.getClass();
        //获取想要注入的属性名称
        Field serviceFiled=clazz.getDeclaredField("userService");
        System.out.println(serviceFiled);
        String name=serviceFiled.getName();
        //首字母还原！！
        name="set"+name.substring(0,1).toUpperCase()+name.substring(1,name.length());
        System.out.println(name);

        Method method=clazz.getDeclaredMethod(name,UserService.class);
        //执行set方法！！！！！
        method.invoke(userController,userService);
        System.out.println(userController.getUserService());
    }
}
