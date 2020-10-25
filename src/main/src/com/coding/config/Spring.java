package com.coding.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration//声明配置类
@ComponentScan("com.coding")//bean扫描路径
//@ImportResource("classpath:spring-config.xml")//导入配置文件
public class Spring {

    @Bean
    @Autowired//spring5之后可以不加
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUsername("admin");
        driverManagerDataSource.setPassword("admin");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/test");
        return driverManagerDataSource;
    }
}
