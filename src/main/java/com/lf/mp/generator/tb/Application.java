package com.lf.mp.generator.tb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.lf.springboot.mapper")
@EnableTransactionManagement //开启springboot事务支持
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
