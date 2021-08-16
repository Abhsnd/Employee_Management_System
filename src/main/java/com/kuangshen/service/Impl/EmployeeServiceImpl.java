package com.kuangshen.service.Impl;

import com.kuangshen.mapper.EmployeeMapper;
import com.kuangshen.pojo.Employee;
import com.kuangshen.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> queryEmployeeList() {
        return employeeMapper.selectList(null);
    }

    @Override
    public Employee queryemployeeById(Integer id) {
        return employeeMapper.selectById(id);
    }

    @Override
    public void insert(Employee employee) {
        employeeMapper.insert(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.updateById(employee);
    }

    @Override
    public void delete(Integer id) {
        employeeMapper.deleteById(id);
    }
}
