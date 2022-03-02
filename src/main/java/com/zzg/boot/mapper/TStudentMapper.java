package com.zzg.boot.mapper;

import com.zzg.boot.pojo.TStudent;

import java.util.List;

/**
 * @Autowired zzg
 */
public interface TStudentMapper {
    /**
     * 查询全部学生数据
     *
     * @return 全部数据
     */
    List<TStudent> queryStudent();


    /**
     * 更具主键id删除数据
     *
     * @param id 要删除的id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 忘数据库添加数据
     *
     * @param record 添加数据
     * @return
     */
    int insert(TStudent record);

    /**
     * 在数据库指定位置添加数据
     *
     * @param record 数据
     * @return
     */
    int insertSelective(TStudent record);

    /**
     * 根据主键id查询书
     *
     * @param id 主键id
     * @return
     */
    TStudent selectByPrimaryKey(Integer id);

    /**
     * 更具主键修改数据
     *
     * @param record 数据
     * @return
     */
    int updateByPrimaryKeySelective(TStudent record);

    /**
     * 修改数据库内容
     *
     * @param record 数据
     * @return
     */
    int updateByPrimaryKey(TStudent record);
}