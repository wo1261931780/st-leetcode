package leetcode.eee001history;

import java.util.Scanner;

// 求int型正整数在内存中存储时1的个数

public class ccc002leetcode {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int x1 = x.nextInt();
        // StringBuilder x2 = new StringBuilder();
        int demo = 0;
        while (true) {
            // x2.append(x1 % 2);
            // System.out.println(x1 %= 2);
            // System.out.println("x1:" + x1);
            // System.out.println("8%2" + 8 % 2);

            if ((x1 / 2) == 1) {
                demo++;
                System.out.println(demo);
                break;
            } else if ((x1 % 2) == 0) {
                x1 /= 2;
            } else if ((x1 % 2) == 1) {
                demo++;
                x1 /= 2;
            } else {
                demo++;
                x1 /= 2;
                System.out.println("x1:" + x1);
            }

        }
    }
}
