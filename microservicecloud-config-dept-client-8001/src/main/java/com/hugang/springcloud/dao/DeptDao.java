package com.hugang.springcloud.dao;

import com.hugang.springcloud.beans.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {

    /**
     * 增加部门
     *
     * @param dept
     * @return true or false
     */
    boolean insertDept(Dept dept);

    /**
     * 根据id查询部门
     *
     * @param id
     * @return dept
     */
    Dept getDept(Long id);

    /**
     * 获取所有的部门
     *
     * @return 部门列表
     */
    List<Dept> getAllDepts();
}
