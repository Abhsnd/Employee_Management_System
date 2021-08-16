package com.kuangshen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 部门表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;     // 部门id
    private String dname;   // 部门名称
}
