package com.lc.cpm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @username 熊一飞
 * @date 2023/3/9 22:46
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.lc.cpm.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
