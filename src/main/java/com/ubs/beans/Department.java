package com.ubs.beans;


public class Department {

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", empCount=" + empCount +
                '}';
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getEmpCount() {
        return empCount;
    }

    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }

    private String deptName;
    private int empCount;

    public Department(String deptName, int empCount){
        this.deptName = deptName;
        this.empCount = empCount;
    }
}
