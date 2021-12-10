package com.hspedu.homework.homwork03_;

public class Professor extends Teacher {
   double grade ;

    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary);
        this.grade = grade;
    }

    @Override
    public void introduce() {
        System.out.println("name=" +name + "age=" + age + "post=" + post + "salary=" +salary + "grade" + grade);
    }
}
