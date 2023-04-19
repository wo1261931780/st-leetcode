package wo1261931780.stleetcode.practice.leetcode.a20230418;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230418
 *
 * @author liujiajun_junw
 * @Date 2023-04-16-29  星期二
 * @description
 */
public class A20230418007 {
	/**
	 * 描述
	 * 找出给定字符串中大写字符(即'A'-'Z')的个数。
	 * 数据范围：字符串长度：
	 * 1
	 * ≤
	 * ∣
	 * �
	 * ∣
	 * ≤
	 * 250
	 * <p>
	 * 1≤∣s∣≤250
	 * 字符串中可能包含空格或其他字符
	 * 进阶：时间复杂度：
	 * �
	 * (
	 * �
	 * )
	 * <p>
	 * O(n) ，空间复杂度：
	 * �
	 * (
	 * �
	 * )
	 * <p>
	 * O(n)
	 * 输入描述：
	 * 对于每组样例，输入一行，代表待统计的字符串
	 * <p>
	 * 输出描述：
	 * 输出一个整数，代表字符串中大写字母的个数
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		int demo = 0;
		for (int i = 0; i < nextLine.length(); i++) {
			char c = nextLine.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				// System.out.print((char) (c + 32));
				demo++;
			}
		}
		System.out.println(demo);
		sampleCode();
	}
	
	
	private static void sampleCode() {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			System.out.println(in.nextLine().replaceAll("[^A-Z]", "").length());
		}
	}
}
