package com.holidayassignments;

public class Employee2 {
    int EmpId;
    String EmpName;
    String EmpEmail;
    char EmpGender;
    float EmpSalary;

    public int getEmpId() {
        return EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public char getEmpGender() {
        return EmpGender;
    }

    public float getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpId(int empId) {
        this.EmpId = empId;
    }

    public void setEmpName(String empName) {
        this.EmpName = empName;
    }

    public void setEmpEmail(String empEmail) {
        this.EmpEmail = empEmail;
    }

    public void setEmpGender(char empGender) {
        this.EmpGender = empGender;
    }

    public void setEmpSalary(float empSalary) {
        this.EmpSalary = empSalary;
    }

    public Employee2() {}

    public Employee2(int empId, String empName, String empEmail, char empGender, float empSalary) {
        super();
        EmpId = empId;
        EmpName = empName;
        EmpEmail = empEmail;
        EmpGender = empGender;
        EmpSalary = empSalary;
    }

    public String GetEmployeeDetails() {
        return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpEmail=" + EmpEmail
                + ", EmpGender=" + EmpGender + ", EmpSalary=" + EmpSalary + "]";
    }

}
