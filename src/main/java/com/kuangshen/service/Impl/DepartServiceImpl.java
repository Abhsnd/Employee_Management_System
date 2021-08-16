package com.kuangshen.service.Impl;

import com.kuangshen.mapper.DepartmentMapper;
import com.kuangshen.pojo.Department;
import com.kuangshen.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> queryDepartmentList() {
        return departmentMapper.selectList(null);
    }

    @Override
    public Department queryDepartmentById(Integer id) {
        return departmentMapper.selectById(id);
    }
}
