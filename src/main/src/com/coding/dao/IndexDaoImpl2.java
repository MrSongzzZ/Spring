package com.coding.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
//实现了 初始化 和销毁时候的回调方法
//@Profile("DEV3") //配置版本
@Scope("prototype")
public class IndexDaoImpl2 implements IndexDao{

//    private String str;


    public IndexDaoImpl2() {
        System.out.println("constructor222222222");
    }

    @Override
    public void test() {
        System.out.println("impl22222");
//        System.out.println(str);
    }


    //构造后执行
    @PostConstruct
    public void setStr() {
        System.out.println("iniit");
    }
}
