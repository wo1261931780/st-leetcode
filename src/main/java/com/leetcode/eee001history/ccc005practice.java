package leetcode.eee001history;

import java.util.Scanner;

public class ccc005practice {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int x1 = x.nextInt();
        int x1_len = 1 + x1 / 2;
        Scanner xx = new Scanner(System.in);
        String x2 = xx.nextLine();
        Scanner xxx = new Scanner(System.in);
        int x3 = xxx.nextInt();
        if (x3 == 0) {
            rank1(split1(x2, x1_len), x3);
        } else {
            //这里做法一样，
            //最大的问题是，返回的数组需要插入空格，语法不了解
        }


    }

    public static int[] split1(String xx, int x1_len) {
        int[] x1 = new int[x1_len];
        for (int i = 0, j = 0; i < xx.length(); i += 2, j++) {
            x1[j] = xx.charAt(i);
        }
        return x1;
    }

    public static int[] rank1(int[] xx, int x3) {
        for (int i = 0; i < xx.length - 1; i++) {
            int mid = 0;
            for (int j = 0; j < xx.length - i - 1; j++) {
                mid = xx[j] > xx[j + 1] ? xx[j + 1] : mid;
                xx[j + 1] = xx[j];
                xx[j] = mid;
            }
        }
        System.out.println(xx);
        return xx;
    }
}
