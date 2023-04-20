package wo1261931780.stleetcode.practice.leetcode.a20230420;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230418.a20230420
 *
 * @author liujiajun_junw
 * @Date 2023-04-15-51  星期四
 * @description
 */
public class A20230420001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();// 输入字符串
		// StringBuilder stringBuilder = new StringBuilder(); // 创建一个StringBuilder对象
		// stringBuilder.append(nextLine);// 将字符串添加到StringBuilder对象中
		// StringBuilder reverse = stringBuilder.reverse();// 反转字符串
		String stringBuilderR = new StringBuilder().append(nextLine).reverse().toString();// 反转字符串
		String demo = "";
		for (int i = 0; i < nextLine.length(); i++) {
			if (nextLine.charAt(i) == stringBuilderR.charAt(i)) {
				demo += nextLine.charAt(i);
			} else if (demo.length() > 1) {
				System.out.println(demo.length());
				return;
			} else {
				demo = "";// 如果不相等，就清空
			}
		}
	}
}
