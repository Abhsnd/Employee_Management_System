package com.kuangshen.service;

import com.kuangshen.pojo.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> queryDepartmentList();      // 查询所有部门信息
    public Department queryDepartmentById(Integer id);  // 通过id查询部门
}
