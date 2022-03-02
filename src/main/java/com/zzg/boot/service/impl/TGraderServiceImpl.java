package com.zzg.boot.service.impl;

import com.zzg.boot.mapper.TGradeMapper;
import com.zzg.boot.pojo.TGrade;
import com.zzg.boot.result.AjaxResult;
import com.zzg.boot.service.TGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：zzg
 * @description：查询所有班级
 * @date ：2022/3/2 9:38
 */
@Service
public class TGraderServiceImpl implements TGradeService {

    @Autowired
    private TGradeMapper tGradeMapper;


    @Override
    public AjaxResult listGrade() {
        List<TGrade> tGrades = tGradeMapper.listGrade();
        return AjaxResult.success(tGrades);
    }
}
