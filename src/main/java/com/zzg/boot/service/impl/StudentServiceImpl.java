package com.zzg.boot.service.impl;

import com.zzg.boot.mapper.TStudentMapper;
import com.zzg.boot.pojo.TStudent;
import com.zzg.boot.result.AjaxResult;
import com.zzg.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：zzg
 * @description：
 * @date ：2022/3/1 16:13
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private TStudentMapper tStudentMapper;

    @Override
    public AjaxResult queryStudent() {
        List<TStudent> tStudents = tStudentMapper.queryStudent();
        return AjaxResult.success(tStudents);
    }
}
