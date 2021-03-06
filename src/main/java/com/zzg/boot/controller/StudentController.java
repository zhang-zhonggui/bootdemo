package com.zzg.boot.controller;

import com.zzg.boot.result.AjaxResult;
import com.zzg.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zzg
 * @description：
 * @date ：2022/3/2 14:04
 */
@RestController
@RequestMapping("stu")
public class StudentController {
    @Autowired
    private StudentService studentServiceImpl;

    @RequestMapping("list")
    public AjaxResult queryStudent() {
        System.out.println(1);
        return studentServiceImpl.queryStudent();
    }

}
