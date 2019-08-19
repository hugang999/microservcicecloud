package com.hugang.springcloud.service;

import com.hugang.springcloud.beans.Dept;

import java.util.List;

public interface DeptService {

    /**
     * 增加部门
     *
     * @param dept
     * @return true or false
     */
    boolean add(Dept dept);

    /**
     * 根据id查询部门
     *
     * @param id
     * @return dept
     */
    Dept get(Long id);

    /**
     * 获取所有的部门
     *
     * @return 部门列表
     */
    List<Dept> list();
}
