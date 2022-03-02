package com.zzg.boot.timetest;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author ：zzg
 * @description：
 * @date ：2022/3/1 15:51
 */
@Component
public class Student {
    @Scheduled(fixedDelay = 10000)
    public void test1(){
        System.out.println("启动器");
    }
}
