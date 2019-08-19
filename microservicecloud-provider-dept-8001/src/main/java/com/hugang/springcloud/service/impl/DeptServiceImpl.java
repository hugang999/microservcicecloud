package com.hugang.springcloud.service.impl;

import com.hugang.springcloud.beans.Dept;
import com.hugang.springcloud.dao.DeptDao;
import com.hugang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired(required = false)
    private DeptDao dao;


    @Override
    public boolean add(Dept dept) {
        return dao.insertDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.getDept(id);
    }


    @Override
    public List<Dept> list() {
        return dao.getAllDepts();
    }
}
