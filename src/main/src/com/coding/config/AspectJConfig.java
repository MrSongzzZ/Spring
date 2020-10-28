package com.coding.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component  //首先作为一个bean  需要spring 管理
@Aspect
public class AspectJConfig {

    @Pointcut("execution(* com.coding.dao.*.*(..))")
    public void pointCut() {

    }

    /**
     * location
     * logic
     */
    @Before("pointCut()")
    public void before() {
        System.out.println("before");
    }

}
