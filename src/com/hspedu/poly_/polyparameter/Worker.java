package com.hspedu.poly_.polyparameter;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();

    }
    public void work() {
        System.out.println("work工作法");
    }
}
