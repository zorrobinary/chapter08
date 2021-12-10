package com.hspedu.poly_.polyarr_;

public class Student extends Person{
        private double score;

    public Student(int age, String name, double score) {
        super(age, name);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String say() {
       return super.say() + "score=" + score;
    }
    public void study() {
        System.out.println("学生" + getName() + "正在听课");
    }
}
