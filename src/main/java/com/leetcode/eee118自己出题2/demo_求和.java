package com.leetcode.eee118自己出题2;

import java.util.Arrays;
import java.util.Random;

public class demo_求和 {
    public static void main(String[] args) {
         Random random = new Random();

        // 数组中，不包含7的所有元素求和
        // int[] x = {1, 7, 9, 10};
        int[] x = new int[10];
        sub(x,random);
        int x1 = 0;
        for (int i : x) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7 || i / 100 == 7) {
            } else {
                System.out.println(i);
                x1 += i;
            }
        }
        System.out.println(x1);
    }

    public static void sub(int[] x, Random x1) {

        for (int i = 0; i < x.length; i++) {
            int x2 = x1.nextInt(1000);
            x[i] = x2;
        }
        System.out.println(Arrays.toString(x));
    }
}
