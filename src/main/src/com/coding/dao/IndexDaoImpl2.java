package com.coding.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
//实现了 初始化 和销毁时候的回调方法
@Profile("DEV3") //配置版本
public class IndexDaoImpl2 implements IndexDao{

//    private String str;


    public IndexDaoImpl2() {
        System.out.println("constructor");
    }

    @Override
    public void test() {
        System.out.println("impl22222");
//        System.out.println(str);
    }


    @PostConstruct
    public void setStr() {
        System.out.println("iniit");
    }
}
