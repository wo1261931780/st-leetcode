package com.leetcode.eee001history;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// public class ccc001demo {
//     public static void main(String[] args) {
//         Scanner x=new Scanner(System.in);
//         int x1 = x.nextInt();
//         System.out.println(x1);
//     }
// }

// public class ccc001demo {
//     public static void main(String[] args) {
//         Scanner x = new Scanner(System.in);
//         System.out.println("请输入数据:");
//         double demo_num = x.nextDouble();
//         int demo_x = (int) demo_num;
//         System.out.println(demo_x);
//
//     }
// }
// 2022年2月7日20:53:32，力扣刷题两道

public class ccc001demo {
    public static void main(String[] args) {
        Scanner x_input = new Scanner(System.in);
        int demo = x_input.nextInt();
        int[] x = new int[demo];
        Random x1 = new Random();

        for (int i = 0; i < x.length; i++) {
            int demo_num = x1.nextInt(999) + 1;
            for (int i1 = 0; i1 < x.length; i1++) {
                if (x[i1] == demo_num) {
                } else {
                    x[i] = demo_num;
                }
            }
        }
        rank(x);
    }

    public static void rank(int[] x) {
        for (int i = 0, max; i < x.length - 1; i++) {
            for (int i1 = 0; i1 < x.length - i - 1; i1++) {
                if (x[i1] > x[i1 + 1]) {
                    max = x[i1];
                    x[i1] = x[i1 + 1];
                    x[i1 + 1] = max;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
