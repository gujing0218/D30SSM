package com.wtu.controller;

import com.github.pagehelper.PageInfo;
import com.wtu.entity.Employee;
import com.wtu.service.EmpService;
import com.wtu.util.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author yangjie
 * 2021/10/27
 */
@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    //1 查询所有的员工信息：从数据库获取数据，通过域传递
    @RequestMapping("/allEmps")
    public String allEmps(Model model){
        //调用service业务层获取数据
        List<Employee> employeeList = empService.allEmps();
        model.addAttribute("employeeList",employeeList);
        return "empList"; //返回页面，视图解析，根据需要设置前后缀
    }
    //2 分页   查询所有的员工信息：从数据库获取数据，通过域传递
    @RequestMapping("/allEmps2")
    public String allEmps(Model model, Params params){
        //调用service业务层获取数据
        List<Employee> employeeList = empService.allEmps(params);
        //将获取的数据，交给分页实现类处理
        PageInfo<Employee> pageInfo = new PageInfo<>(employeeList);
//        model.addAttribute("employeeList",employeeList);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("params",params);
        return "empList"; //返回页面，视图解析，根据需要设置前后缀
    }
    //3 删除
    @RequestMapping("/deleteEmp")
    public String deleteEmpById(int id){
        empService.deleteById(id);
//        删除完成，重定向回到所有信息的页面
        return "redirect:allEmps2";
    }
    //4 添加
    @RequestMapping("/insertEmp")
    public String insertEmp(Employee employee){
        empService.insertEmp(employee);
        return "redirect:allEmps2";
    }
    //5 修改1 获取该员工 信息展示到修改页面  和删除区别；使用restful风格
    @RequestMapping("/updateGetById/{id}")
    public String updateGetById(@PathVariable int id,Model model){
        Employee employee = empService.selectById(id);
        model.addAttribute("employee",employee);
        return "updateEdit";
    }
    //6 修改2 修改页面 提交修改执行
    @RequestMapping("/updateEmp")
    public String updateEmp(Employee employee){
        empService.updateEmp(employee);
        return "redirect:allEmps2";
    }
}
