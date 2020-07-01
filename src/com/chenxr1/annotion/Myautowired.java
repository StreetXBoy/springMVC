package com.chenxr1.annotion;

import java.lang.annotation.*;

/**
 * @author 重新做人idea基础学习
 * @date 2020-7-01
 */

//自定义注解

 @Retention(RetentionPolicy.RUNTIME)
 @Target(ElementType.FIELD)
 @Inherited
 @Documented
public @interface Myautowired {

}
