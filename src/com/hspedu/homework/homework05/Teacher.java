package com.hspedu.homework.homework05;

public class Teacher extends Employee {
    private double classFee;

    public Teacher(String name, double salary, double classFee) {
        super(name, salary);
        this.classFee = classFee;
    }

    @Override
    public void printSal() {
        System.out.println("姓名："+getName()+"\t"+"工资："+(getSalary()*12+classFee));
    }
}
