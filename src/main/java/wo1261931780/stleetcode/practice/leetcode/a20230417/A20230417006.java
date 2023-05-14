package wo1261931780.stleetcode.practice.leetcode.a20230417;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230417
 *
 * @author liujiajun_junw
 * @Date 2023-04-16-24  星期一
 * @description
 */
public class A20230417006 {
	
	/**
	 * 描述
	 * 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
	 * <p>
	 * 数据范围：输入的字符串长度满足
	 * 1
	 * ≤
	 * �
	 * ≤
	 * 1000
	 * <p>
	 * 1≤n≤1000
	 * <p>
	 * 输入描述：
	 * 输入一行字符串，可以有空格
	 * <p>
	 * 输出描述：
	 * 统计其中英文字符，空格字符，数字字符，其他字符的个数
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		int[] ints = new int[4];
		for (int i = 0; i < nextLine.length(); i++) {
			char c = nextLine.charAt(i);
			if (c >= 'a' && c <= 'z') {
				ints[0] += 1;
			} else if (c == ' ') {
				ints[1] += 1;
			} else if (c >= '0' && c <= '9') {
				ints[2] += 1;
			} else {
				ints[3] += 1;
			}
		}
		for (int anInt : ints) {
			System.out.println(anInt);
		}
	}
}
