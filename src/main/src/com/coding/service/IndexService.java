package com.coding.service;

import com.coding.dao.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service

public class IndexService {

    @Autowired
//    @Qualifier("indexDaoImpl1")  //限定符  指定注入的bean
    IndexDao indexDaoImpl1;

//    public IndexService(IndexDao dao) {
//        this.dao = dao;
//    }

    public void test() {
        indexDaoImpl1.test();
    }

    public void test1(String temp) {
        System.out.println(temp);
    }

    public void test2() {

    }

//    public void setDao(IndexDao dao) {
//        this.dao = dao;
//    }
}
