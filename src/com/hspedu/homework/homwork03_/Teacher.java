package com.hspedu.homework.homwork03_;

public class Teacher {
     String name;
     int age;
     String post;
     double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }



    public void introduce(){

        //打印教室信息。
        System.out.println("name=" +name + "age=" + age + "post=" + post + "salary=" +salary);
    }
}
