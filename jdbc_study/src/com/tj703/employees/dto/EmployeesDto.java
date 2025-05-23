package com.tj703.employees.dto;

import java.util.Date;
import java.util.List;

public class EmployeesDto {
    /*emp_no
    birth_date
    first_name
    last_name
    gender
    hire_date*/
    private int empNo;
    private Date birthDate;
    private String firstName;
    private String lastName;
    private char gender;
    private Date hireDate;

    //emp: sal = 1:N
    private List<SalariesDto> salariesList;
    //1:N 인데 1:1 인거 처럼 출력
    private SalariesDto salary;
    //N:1
    private DepartmentsDto department;

    public SalariesDto getSalary() {
        return salary;
    }

    public void setSalary(SalariesDto salary) {
        this.salary = salary;
    }

    public DepartmentsDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentsDto department) {
        this.department = department;
    }

    public List<SalariesDto> getSalariesList() {
        return salariesList;
    }

    public void setSalariesList(List<SalariesDto> salariesList) {
        this.salariesList = salariesList;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "{" +
                "empNo:" + empNo +
                ", birthDate:" + birthDate +
                ", firstName:'" + firstName + '\'' +
                ", lastName:'" + lastName + '\'' +
                ", gender:" + gender +
                ", hireDate:" + hireDate +
                ", salariesList:" + salariesList +
                ", salary:" + salary +
                ", department:" + department +
                "}\n";
    }
}
