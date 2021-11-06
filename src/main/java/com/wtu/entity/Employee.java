package com.wtu.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author yangjie
 * 2021/10/27
 */
public class Employee {
    private Integer eno;//员工编号
    private String ename;//员工姓名
    private String job;//工作岗位
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hiredate;//入职时间
    private Integer age;//年龄
    private String sex;//性别
    private Double sal; //工资
    private Integer dno; //部门编号

    public Employee() {
    }

    public Employee(Integer eno, String ename, String job, Date hiredate, Integer age, String sex, Double sal, Integer dno) {
        this.eno = eno;
        this.ename = ename;
        this.job = job;
        this.hiredate = hiredate;
        this.age = age;
        this.sex = sex;
        this.sal = sal;
        this.dno = dno;
    }
   //没有id的全参构造
    public Employee(String ename, String job, Date hiredate, Integer age, String sex, Double sal, Integer dno) {
        this.ename = ename;
        this.job = job;
        this.hiredate = hiredate;
        this.age = age;
        this.sex = sex;
        this.sal = sal;
        this.dno = dno;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", hiredate=" + hiredate +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", sal=" + sal +
                ", dno=" + dno +
                '}';
    }
}
