package com.zzg.boot.service;

import com.zzg.boot.result.AjaxResult;

public interface StudentService {
    /**
     * 查询所有学生数据
     *
     * @return 学生数据
     */
    AjaxResult queryStudent();
}
