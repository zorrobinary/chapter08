package com.hspedu.object_;

public class HashCode_ {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa2 = new AA();
        AA aa3 = aa;
        System.out.println("aa的hashcode()" + aa.hashCode());
        System.out.println("aa2的hashcode()" + aa2.hashCode());
        System.out.println("aa3的hashcode()" + aa3.hashCode());
    }

}
class AA {}

