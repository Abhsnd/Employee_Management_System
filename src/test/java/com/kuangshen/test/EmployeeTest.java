package com.kuangshen.test;

import com.kuangshen.mapper.EmployeeMapper;
import com.kuangshen.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class EmployeeTest {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Employee> employeeList = employeeMapper.selectList(null);
        for (Employee employee : employeeList) {
            System.out.println("employee = " + employee);
        }
    }

    @Test
    public void testSelectById() {
        Employee employee = employeeMapper.selectById(1001);
        System.out.println("employee = " + employee);
    }

//    @Test
//    public void testInsert() {  // 测试插入数据
//        Employee employee = new Employee();
//        employee.setName("kkkl");
//        employee.setGender(1);
//        employee.setEmail("ppz@qq.com");
//        employee.setDeptno(103);
//        int count = employeeMapper.insert(employee);
//        System.out.println("count = " + count);
//        System.out.println("employee = " + employee);
//    }

}
