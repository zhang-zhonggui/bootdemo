package com.zzg.boot.mapper;

import com.zzg.boot.pojo.TGrade;

import java.util.List;

public interface TGradeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TGrade record);

    int insertSelective(TGrade record);

    TGrade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TGrade record);

    int updateByPrimaryKey(TGrade record);

    List<TGrade> listGrade();
}