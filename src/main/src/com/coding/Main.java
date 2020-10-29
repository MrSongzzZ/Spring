package com.coding;

import com.coding.config.Spring;
import com.coding.dao.IndexDao;
import com.coding.dao.IndexDaoImpl;
import com.coding.dao.IndexDaoImpl2;
import com.coding.entity.City;
import com.coding.service.IndexService;
import com.coding.util.CommUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
        //获取配置文件 spring工厂
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
//        IndexService indexService = (IndexService) classPathXmlApplicationContext.getBean("indexService");


        //获取注解对应spring工厂
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring.class);
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        //手动注册配置文件 然后重新扫描  省略扫描配置文件的过程
        annotationConfigApplicationContext.getEnvironment().addActiveProfile("DEV3");
        annotationConfigApplicationContext.register(Spring.class);
        annotationConfigApplicationContext.refresh();
//        IndexService indexService = (IndexService) annotationConfigApplicationContext.getBean("indexService");

        IndexDao indexDao = (IndexDao) annotationConfigApplicationContext.getBean("indexDaoImpl2");

//        Class<?>[] interfaces = new Class[]{IndexDao.class};
//        byte[] bytes = ProxyGenerator.generateProxyClass("IndexClass", interfaces);
//        File file = new File("D:/indexDao.class");
//        try {
//            FileOutputStream fileWriter = new FileOutputStream(file);
//            fileWriter.write(bytes);
//            fileWriter.flush();
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        indexDao.test();
//        indexService.test();
//        indexService.test1("123");
//        indexService.test2();

//        City city = new City();
//        city.setId(1);
//        city.setName("asdf");
//        CommUtil.buildSqlQuery(city);
    }
}
