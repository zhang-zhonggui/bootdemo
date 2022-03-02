package com.zzg.boot.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：zzg
 * @description：
 * @date ：2022/3/1 16:13
 */
@Service
public class StudentServiceImpl {
    @Async
    @Transactional
    public String begin(){
        System.out.println("游戏开始了");
        try {
            //当前线程休眠十秒
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("游戏中");
        return "游戏开始了";
    }
}
