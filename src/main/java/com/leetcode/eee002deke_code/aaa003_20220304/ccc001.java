package leetcode.eee002deke_code.aaa003_20220304;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa003_20220304
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-20  星期五
 */
public class ccc001 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while (x.hasNext()) {
            show(x.nextInt());
        }
    }

    // 描述
    // 输出小于等于 n 的与 7 有关数字的个数，包括 7 的倍数，还有包含 7 的数字（如 17 ，27 ，37 ... 70 ，71 ，72 ，73...）的个数（一组测试用例里可能有多组数据，请注意处理）
    // 数据范围： 1 \le n \le 30000 \1≤n≤30000
    // 本题有多组输入
    // 输入描述：
    // 多组输入每组输入 1 个正整数 n 。( n 不大于 30000 )
    // 输出描述：
    // 不大于n的与7有关的数字个数，例如输入20，与7有关的数字包括7,14,17.

    public static int show(int x) {
        // 1.整数倍
        // 2.有7存在
        int num = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 7 == 0) {
                num++;
            } else {
                String demo = i + "";
                for (int j = 0; j < demo.length(); j++) {
                    int zf = demo.charAt(j) - '0';
                    if (zf == 7) {
                        num++;
                        break;
                    }
                }
            }
        }
        return num;
    }
}
