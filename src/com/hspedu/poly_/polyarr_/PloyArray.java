package com.hspedu.poly_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person(20, "jack");
        persons[1] = new Student(18, "jack",100);
        persons[2] = new Student(19, "jack",30);
        persons[3] = new Teacher(30, "jack",20000);
        persons[4] = new Teacher(50, "jack",20400);
        //循环遍历
        for (int i = 0; i < persons.length; i++) {
            //person[i]扁你类型Person
           //System.out.println( persons[i].say());
            if(persons[i] instanceof Student){
                ((Student) persons[i]).study();
            }else if(persons[i] instanceof Teacher){
                ((Teacher) persons[i]).teach();
            }

        }
    }
}
