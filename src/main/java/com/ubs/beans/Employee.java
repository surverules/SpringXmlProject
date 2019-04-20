package com.ubs.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

 public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", dept='" + dept + '\'' +
                ", deptDetail='" + deptDetail.toString() + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    private String name;
    private int empId;
    private String dept;
    @Autowired
    private Department deptDetail;


    public Employee(String name, int empId, String dept){
        this.name = name;
        this.empId = empId;
        this.dept = dept;
    }

}
