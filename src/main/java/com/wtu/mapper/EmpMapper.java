package com.wtu.mapper;

import com.wtu.entity.Employee;
import com.wtu.util.Params;

import java.util.List;

public interface EmpMapper {
    //1 查询所有员工信息
    List<Employee> allEmps();
    //2 条件查询    Parameters
    List<Employee> allEmps(Params params);
    //3 根据id删除
    void deleteById(int id);
    //4 添加
    void insertEmp(Employee employee);
    //5 根据id查询员工
    Employee selectById(int id);
    //6 修改执行
    void updateEmp(Employee employee);
}
