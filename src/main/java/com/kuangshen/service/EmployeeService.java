package com.kuangshen.service;

import com.kuangshen.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> queryEmployeeList();      // 查询所有员工
    public Employee queryemployeeById(Integer id);  // 通过id查询员工
    public void insert(Employee employee);          // 增加员工
    public void update(Employee employee);          // 修改员工
    public void delete(Integer id);                 // 删除员工
}
