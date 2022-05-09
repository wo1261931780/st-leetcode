package leetcode.eee002deke_code.aaa003_20220304;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa003_20220304
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-47  星期五
 */
public class ccc002 {
    public static void main(String[] args) {
        // 1.递归，计算兔子数量
        Scanner x = new Scanner(System.in);
        System.out.println(show(9));
    }

    public static int show(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return show(x - 1) + show(x - 2);
        }
    }
}
