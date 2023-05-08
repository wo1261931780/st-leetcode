package wo1261931780.stleetcode.practice.leetcode.a20230508;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230508
 *
 * @author liujiajun_junw
 * @Date 2023-05-16-31  星期一
 * @description
 */
public class A20230508008 {
    /**
     * 描述
     * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
     * <p>
     * 数据范围：
     * 1
     * ≤
     * �
     * ,
     * �
     * ≤
     * 100000
     * <p>
     * 1≤a,b≤100000
     * 输入描述：
     * 输入两个正整数A和B。
     * <p>
     * 输出描述：
     * 输出A和B的最小公倍数。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nextLine = scanner.nextLine().split(" ");
        int[] nums = new int[nextLine.length];
        for (int i = 0; i < nextLine.length; i++) {
            nums[i] = Integer.parseInt(nextLine[i]);
        }
        int min = Math.min(nums[0], nums[1]);
        int max = Math.max(nums[0], nums[1]);

        for (int i = min; true; i++) {
            if (max / min == min) {
                System.out.println(max);
                break;
            } else if (i / min == max) {
                System.out.println(i);
                break;
            }
        }
        sampleCode();
    }

    public static void sampleCode() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;                     //存储a的原始值，递归过程中使用。
        System.out.println(gcb(a, b, c));
    }

    public static int gcb(int a, int b, int c) {
        if (a % b == 0) {                    //a累加过程中永远可以整除自身，所以可以整除b时就是最小公倍数！
            return a;
        }
        return gcb(a + c, b, c);            //a累加自身原始值，例如a=4。  a=4,8,12,16....
    }
}
