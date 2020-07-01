package com.chenxr1.test;

import com.chenxr1.annotion.Myautowired;
import com.chenxr1.controller.UserController;

import java.lang.reflect.Field;
import java.util.stream.Stream;

/**
 * @author 重新做人idea基础学习
 * @date 2020-7-01
 */
public class Test2 {
    public static void main(String[] args) {
        UserController userController=new UserController();
        Class<? extends UserController> clazz = userController.getClass();
        Stream.of(clazz.getDeclaredFields()).forEach(field->{
            Myautowired annotion=  field.getAnnotation(Myautowired.class);
            if(annotion!=null){
                field.setAccessible(true);
                Class<?> type = field.getType();
                Object o = null;
                try {
                    o = type.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                try {
                    field.set(userController,o);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }

        });
        System.out.println(userController.getUserService());
    }
}
