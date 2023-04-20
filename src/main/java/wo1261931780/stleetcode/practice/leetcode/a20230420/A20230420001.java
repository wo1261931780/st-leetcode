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
	/**
	 * 描述
	 * 给定一个仅包含小写字母的字符串，求它的最长回文子串的长度。
	 * 所谓回文串，指左右对称的字符串。
	 * 所谓子串，指一个字符串删掉其部分前缀和后缀（也可以不删）的字符串
	 * 数据范围：字符串长度
	 * 1
	 * ≤
	 * �
	 * ≤
	 * 350
	 * <p>
	 * 1≤s≤350
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
	 * 输入一个仅包含小写字母的字符串
	 * <p>
	 * 输出描述：
	 * 返回最长回文子串的长度
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int max = 0;
		/**
		 *双指针遍历找到最长子串
		 */
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length(); j > i; j--) {
				String toBeJudged = s.substring(i, j);
				if (isPalindromeString(toBeJudged)) {
					max = Math.max(max, j - i);
				}
			}
		}
		System.out.print(max);
	}
	
	/**
	 * 判断一个字符串是否是回文字符串的方法
	 */
	public static boolean isPalindromeString(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
}
