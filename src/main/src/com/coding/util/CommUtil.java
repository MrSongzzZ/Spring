package com.coding.util;

import com.coding.anno.Entity;

public class CommUtil {

    public static String buildSqlQuery(Object object) {

        Class aClass = object.getClass();

        //首先判断类是否被修饰
        if (aClass.isAnnotationPresent(Entity.class)) {
            //得到注解的
            Entity entity = (Entity) aClass.getAnnotation(Entity.class);
            //调用方法
            String entityName = entity.value();
            System.out.println(entityName);
        }

        return "";
    }
}
