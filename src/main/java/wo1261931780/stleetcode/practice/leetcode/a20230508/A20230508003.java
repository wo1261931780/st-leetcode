package wo1261931780.stleetcode.practice.leetcode.a20230508;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230508
 *
 * @author liujiajun_junw
 * @Date 2023-05-12-48  星期一
 * @description
 */
public class A20230508003 {
    /**
     * 描述
     * 自守数是指一个数的平方的尾数等于该数自身的自然数。例如：25^2 = 625，76^2 = 5776，9376^2 = 87909376。请求出n(包括n)以内的自守数的个数
     * <p>
     * <p>
     * 数据范围：
     * 1
     * ≤
     * �
     * ≤
     * 10000
     * <p>
     * 1≤n≤10000
     * <p>
     * <p>
     * 输入描述：
     * int型整数
     * <p>
     * 输出描述：
     * n以内自守数的数量。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= nextInt; i++) {
            if (show(i)) {
                count++;
                arrayList.add(i);
            }
        }
        System.out.print("有");
        arrayList.forEach(s -> {
            if (s != arrayList.get(arrayList.size() - 1)) {
                System.out.print(s + ",");
            } else {
                System.out.print(s);
            }
        });
        System.out.print("这" + count + "个自守数");
        sampleCode();
    }

    public static Boolean show(int demo) {
        String i = String.valueOf((int) Math.pow(demo, 2));
        String demo2 = String.valueOf(demo);
        return i.endsWith(demo2);
    }

    public static void sampleCode() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int count = 0;
            for (int i = 0; i <= n; i++) {
                String str = String.valueOf(i * i);
                String s = String.valueOf(i);
                if (str.endsWith(s)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
