package com.coding.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 默认情况下 自定义注定的生命周期 就是在java类中  编译后就丢失
 */
@Target(ElementType.TYPE) //注解作用类型 可以作用在类、方法、属性上
//生命周期  class 在class文件中  source是在源码中  runTime是在运行时
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {

    public String value() default "";
}
