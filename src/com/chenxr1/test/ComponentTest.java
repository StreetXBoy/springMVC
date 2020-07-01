package com.chenxr1.test;

import com.chenxr1.Dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author 重新做人idea基础学习
 * @date 2020-7-01
 */
public class ComponentTest {
    ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\chen\\Desktop\\springMVC\\src\\applicationContext.xml");
    @Test
    public void TestUserDao(){
        UserDao user=(UserDao) context.getBean("userDao");
        System.out.println(user.getName());
        System.out.println(user.getClass());

    }
}
