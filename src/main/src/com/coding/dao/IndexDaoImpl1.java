package com.coding.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@Primary //指定主要使用的bean  也可以是数据源  可以解决byType 重复的问题
//实现了 初始化 和销毁时候的回调方法
@Profile("DEV1")
public class IndexDaoImpl1 implements IndexDao, InitializingBean, DisposableBean {

//    private String str;


    public IndexDaoImpl1() {
        System.out.println("constructor");
    }

    @Override
    public void test() {
        System.out.println("impl11111");
//        System.out.println(str);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init");
    }

//    public void setStr(String str) {
//        this.str = str;
//    }
}
