package com.wtu.service;

import com.github.pagehelper.PageHelper;
import com.wtu.entity.Employee;
import com.wtu.mapper.EmpMapper;
import com.wtu.util.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yangjie
 * 2021/10/27
 */
@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Employee> allEmps() {
        return empMapper.allEmps();
    }
    @Override
    public List<Employee> allEmps(Params params) {

        if (params.getPageNum()==0){
            params.setPageNum(1);
        }
        PageHelper.startPage(params.getPageNum(),params.getPageSize());//需要当前页、每页条数两个参数
        return empMapper.allEmps(params);
    }
    //删除
    @Override
    public void deleteById(int id) {
        empMapper.deleteById(id);
    }
    //添加
    @Override
    public void insertEmp(Employee employee) {
        empMapper.insertEmp(employee);
    }
    //根据id查询该员工
    @Override
    public Employee selectById(int id) {
        Employee employee = empMapper.selectById(id);
        return employee;
    }
    //修改执行
    @Override
    public void updateEmp(Employee employee) {
        empMapper.updateEmp(employee);
    }
}
