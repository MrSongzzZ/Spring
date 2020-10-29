package com.coding.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Profile("DEV2")
public class IndexDaoImpl implements IndexDao{

//    private String str;

    @Override
    public void test() {
        System.out.println("impl0");
//        System.out.println(str);
    }

    public void test1(String temp) {
        System.out.println(temp);
    }

//    public void setStr(String str) {
//        this.str = str;
//    }
}
