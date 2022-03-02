package com.zzg.boot.controller;

import com.zzg.boot.service.impl.StudentServiceImpl;
import com.zzg.boot.result.AjaxResult;
import com.zzg.boot.service.TGradeService;
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
    @Autowired
    private TGradeService tGraderServiceImpl;


    @RequestMapping("stu")
    public String test() {
        String begin = "";
        //在这直接执行下一步，进行异步操作
        begin = student.begin();
        System.out.println(begin);
        return "游戏结束了";
    }

    @RequestMapping("grade")
    public AjaxResult listGrade() {
        return tGraderServiceImpl.listGrade();
    }
}
