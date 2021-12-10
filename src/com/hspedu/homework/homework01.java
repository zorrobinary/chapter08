package com.hspedu.homework;
public class homework01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        Person tmp = null;
        person[0] = new Person("jack", 16, "老师");
        person[1] = new Person("ckk", 33, "教授");
        person[2] = new Person("robin", 39, "教练");
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[i].getAge() < person[i + 1].getAge()) {
                    tmp = person[i + 1];
                    person[i + 1] = person[i];
                    person[i] = tmp;
                }
            }
        }
        for(int i=0; i< person.length; i++){
            System.out.println(person[i]);
        }
    }

}
class Person {
    String name ;
    int  age;
    String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
