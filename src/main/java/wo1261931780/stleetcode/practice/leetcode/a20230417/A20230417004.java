package wo1261931780.stleetcode.practice.leetcode.a20230417;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230417
 *
 * @author liujiajun_junw
 * @Date 2023-04-15-35  星期一
 * @description
 */
public class A20230417004 {
	/**
	 * 描述
	 * Lily上课时使用字母数字图片教小朋友们学习英语单词，每次都需要把这些图片按照大小（ASCII码值从小到大）排列收好。请大家给Lily帮忙，通过代码解决。
	 * Lily使用的图片使用字符"A"到"Z"、"a"到"z"、"0"到"9"表示。
	 * <p>
	 * 数据范围：每组输入的字符串长度满足
	 * 1
	 * ≤
	 * �
	 * ≤
	 * 1000
	 * <p>
	 * 1≤n≤1000
	 * <p>
	 * 输入描述：
	 * 一行，一个字符串，字符串中的每个字符表示一张Lily使用的图片。
	 * <p>
	 * 输出描述：
	 * Lily的所有图片按照从小到大的顺序输出
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		char[] toCharArray = nextLine.toCharArray();
		Arrays.sort(toCharArray);
		for (char c : toCharArray) {
			System.out.print(c);
		}
		
	}
}
