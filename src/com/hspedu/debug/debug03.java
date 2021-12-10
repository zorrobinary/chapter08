package com.hspedu.debug;

import java.util.Arrays;

public class debug03 {
    public static void main(String[] args) {
        int[] arr = {1,43,5,6,8,3,-10};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");

        }
    }
}
