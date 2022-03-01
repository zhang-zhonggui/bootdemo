package com.zzg;

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
@SpringBootApplication
@EnableScheduling
@EnableAsync
@EnableTransactionManagement
public  class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}