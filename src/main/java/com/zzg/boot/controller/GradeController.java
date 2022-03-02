package com.zzg.boot.controller;

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
public class GradeController {

    @Autowired
    private TGradeService tGraderServiceImpl;

    @RequestMapping("grade")
    public AjaxResult listGrade() {
        return tGraderServiceImpl.listGrade();
    }
}
