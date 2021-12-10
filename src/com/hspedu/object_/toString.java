package com.hspedu.object_;

public class toString {
    public static void main(String[] args) {
        people jack = new people("jack", "psychologist", 20000);
        System.out.println(jack.toString());
        System.out.println(jack.hashCode());
        System.out.println(jack);

    }
}
class people {
    private String name;
    private String job;
    private double sal;

    public people(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
