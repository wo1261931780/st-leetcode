package wo1261931780.stleetcode.practice.leetcode.a20230508;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230508
 *
 * @author liujiajun_junw
 * @Date 2023-05-14-31  星期一
 * @description
 */
public class A20230508006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        int demo = nextLine.length() * 2;
        nextLine = nextLine.replace("*", "|");
        for (int i = 0; i < demo; i++) {
            nextLine = nextLine.replace(String.valueOf(i), "*" + i + "*");
        }
        nextLine = nextLine.replace("**", "");
        nextLine = nextLine.replace("|", "*");
        System.out.println(nextLine);
        sampleCode();
    }

    public static void sampleCode() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println(input.replaceAll("([0-9]+)", "*$1*")); //把所有的数字段提取出来，前后加上星号再放回去
        }
    }
}
