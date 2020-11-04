package com.coding.config;

import com.coding.dao.IndexDao;
import com.coding.dao.IndexDaoImpl2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sun.applet.AppletResourceLoader;

@Component  //首先作为一个bean  需要spring 管理
//@Aspect
@Aspect("perthis(pointCutThis())")
@Scope("prototype")
public class AspectJConfig {

    //把目标对象 实现一个接口 indexDao  具体实现方法使用impl2里面的方法
//    @DeclareParents(value = "com.coding.dao.*", defaultImpl = IndexDaoImpl2.class)
//    public static IndexDao indexDao;

    @Pointcut("execution(* com.coding.*.*.*(java.lang.String,..))")  //可以具体到方法和参数 还有返回值 和 可写可不写的访问修饰
    public void pointCutExecution() {

    }

    @Pointcut("within(com.coding.service.*)")
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

//    @Before("pointCutThis()")
//    public void before1(JoinPoint joinPoint) {
//        System.out.println(this.hashCode());
//        System.out.println("before");
//        System.out.println(joinPoint.getThis());
//        System.out.println(joinPoint.getTarget());
//    }

//    @After("pointCutWithin()")
//    public void after() {
//        System.out.println("after");
//    }

    @Around("pointCutThis()")//也可以直接写个表达式
    public void around(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println(this.hashCode());
        System.out.println("before");
        Object[] args = proceedingJoinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            args[i] += " world";
        }
        try {
            proceedingJoinPoint.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("after");
    }

}
