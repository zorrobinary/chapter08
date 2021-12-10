package com.hspedu.homework.homework05;

public class homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker("李淳罡", 20000);
        Farmer farmer = new Farmer("毛泽东", 10000);
        Teacher teacher = new Teacher("孔子", 30000, 300);
        Scientist scientist = new Scientist("爱因斯坦", 50000, 100000);
        worker.printSal();
        farmer.printSal();
        teacher.printSal();
        scientist.printSal();


    }
}
