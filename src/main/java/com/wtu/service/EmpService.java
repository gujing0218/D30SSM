package com.wtu.service;

import com.wtu.entity.Employee;
import com.wtu.util.Params;

import java.util.List;

public interface EmpService {
    //普通查询
    List<Employee> allEmps();
    //分页查询
    List<Employee> allEmps(Params params);
    //根据id删除员工
    void deleteById(int id);
    //添加
    void insertEmp(Employee employee);
    //根据id查询员工
    Employee selectById(int id);
    //修改执行
    void updateEmp(Employee employee);
}
