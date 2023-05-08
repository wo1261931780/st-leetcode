package wo1261931780.stleetcode.practice.leetcode.a20230508;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230508
 *
 * @author liujiajun_junw
 * @Date 2023-05-13-17  星期一
 * @description
 */
public class A20230508004 {
    /**
     * 描述
     * 将一个字符串str的内容颠倒过来，并输出。
     * <p>
     * 数据范围：
     * 1
     * ≤
     * �
     * �
     * �
     * (
     * �
     * �
     * �
     * )
     * ≤
     * 10000
     * <p>
     * 1≤len(str)≤10000
     * 输入描述：
     * 输入一个字符串，可以有空格
     * <p>
     * 输出描述：
     * 输出逆序的字符串
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String string = new StringBuilder(nextLine).reverse().toString();
        System.out.println(string);
    }
}
