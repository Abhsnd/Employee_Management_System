package com.kuangshen.test;

import com.kuangshen.mapper.DepartmentMapper;
import com.kuangshen.pojo.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DepartmentTest {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void testSelect() {
        List<Department> departments = departmentMapper.selectList(null);
        for (Department department : departments) {
            System.out.println("department = " + department);
        }
    }

    @Test
    public void testSelectById() {
        Department department = departmentMapper.selectById(101);
        System.out.println("department = " + department);
    }
}
