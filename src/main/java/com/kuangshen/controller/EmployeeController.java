package com.kuangshen.controller;

import com.kuangshen.pojo.Department;
import com.kuangshen.pojo.Employee;
import com.kuangshen.service.DepartmentService;
import com.kuangshen.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    private Department department;

    // 展示员工列表
    @RequestMapping("/emps")
    public String list(Model model) {
        List<Employee> employees = employeeService.queryEmployeeList(); // 查询所有员工信息
        for (Employee employee : employees) {
            department = departmentService.queryDepartmentById(employee.getDeptno());   // 查询员工所属部门
            employee.setDepartment(department);
        }
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    // 进入增加员工页面
    @GetMapping("/add")
    public String toaddpage(Model model) {
        List<Department> departments = departmentService.queryDepartmentList(); // 查询所有部门(用于显示部门列表)
        model.addAttribute("deps", departments);
        return "emp/add";
    }

    // 执行增加员工
    @PostMapping("/add")
    public String addEmp(Employee employee) {
        employeeService.insert(employee);   // 插入一条员工信息
        return "redirect:/emps";
    }

    // 进入修改员工页面
    @GetMapping("/update/{id}")
    public String toupdate(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeService.queryemployeeById(id);
        List<Department> departments = departmentService.queryDepartmentList();
        model.addAttribute("emp", employee);
        model.addAttribute("deps", departments);
        return "emp/update";
    }

    // 执行修改员工
    @PostMapping("/update")
    public String updateEmp(Employee employee) {
        employeeService.update(employee);   // 修改员工信息
        return "redirect:/emps";
    }

    // 执行删除员工
    @GetMapping("/delete/{id}")
    public String todelete(@PathVariable("id") Integer id) {
        employeeService.delete(id);     // 删除员工信息
        return "redirect:/emps";
    }

}

