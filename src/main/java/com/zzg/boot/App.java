package com.zzg.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author ：zzg
 * @description：
 * @date ：2022/2/28 11:35
 */

@EnableScheduling//定时器
@EnableAsync//异步
@EnableTransactionManagement//事务管理
@SpringBootApplication
@MapperScan("com.zzg.boot.mapper")
public  class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}
