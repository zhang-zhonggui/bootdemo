package com.zzg.controller;

import com.zzg.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zzg
 * @description：
 * @date ：2022/2/28 11:34
 */
@RestController
@RequestMapping("test")
public class StudentController {
    @Autowired
    private StudentServiceImpl student;

    @RequestMapping("stu")
    public String test() {
        String begin="";
        //在这直接执行下一步，进行异步操作
        begin = student.begin();
        System.out.println(begin);
        return "游戏结束了";
    }
}
