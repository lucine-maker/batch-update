package com.lt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lucine
 * @version 1.0 2022/8/21 15:14
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lt.mapper")
public class Application {

    public static void main(String [] args){
        SpringApplication.run(Application.class,args);
    }

}
