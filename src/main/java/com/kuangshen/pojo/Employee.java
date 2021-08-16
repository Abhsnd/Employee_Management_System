package com.kuangshen.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 员工表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @TableId(value = "id", type = IdType.AUTO)  // 数据库主键，自增
    private Integer id;         // 员工id
    private String name;        // 姓名
    private String email;       // 邮箱
    private Integer gender;     // 性别 0：女   1：男
    private Integer deptno;     // 部门id


    @TableField(exist = false)      // 非数据库字段
    private Department department;
}
