package com.coding.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component  //首先作为一个bean  需要spring 管理
@Aspect
public class AspectJConfig {

    @Pointcut("execution(* com.coding.*.*.*(java.lang.String,..))")  //可以具体到方法和参数 还有返回值 和 可写可不写的访问修饰
    public void pointCutExecution() {

    }

    @Pointcut("within(com.coding.dao.*)")
    public void pointCutWithin() {

    }

    @Pointcut("args(java.lang.String)") //不关心方法和类 只关心参数
    public void pointCutArgs() {

    }

    @Pointcut("@annotation(com.coding.anno.Luabn)") //不关心方法和类 只关心参数
    public void pointCutAnnotation() {
    }

    @Pointcut("this(com.coding.dao.IndexDao)")
    public void pointCutThis() {

    }

    @Pointcut("target(com.coding.dao.IndexDaoImpl2)")
    public void pointCutTarget() {

    }

    /**
     * location
     * logic
     */
//    @Before("pointCutWithin() && !pointCutArgs()") //可以使用表达式
//    public void before() {
//        System.out.println("before");
//    }

    @Before("pointCutTarget()")
    public void before1() {
        System.out.println("before");
    }

}
