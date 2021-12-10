package com.hspedu.homework.homework04;

public class manager extends employee {
    private double bonus;

    public manager(String name, double salary, int workday, double grade) {
        super(name, salary, workday, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("姓名：  " + getName() + "  薪水：" + (getSalary() * getWorkday() * getGrade() + bonus));
        ;
    }
}

