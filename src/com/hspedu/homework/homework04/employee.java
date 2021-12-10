package com.hspedu.homework.homework04;

public class employee {
    private String name;
    private double salary;
    private int workday;
    private double grade;

    public employee(String name, double salary, int workday, double grade) {
        this.name = name;
        this.salary = salary;
        this.workday = workday;
        this.grade = grade;
    }

    public void printSal() {
        System.out.println("姓名：" + name + "工资：" + salary * workday * grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
