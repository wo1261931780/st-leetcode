package wo1261931780.stleetcode.practice.leetcode.a20230218;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode.github.io
 * Package:com.stleetcode.github.io.junw.practice.leetcode.a20230218
 *
 * @author liujiajun_junw
 * @Date 2023-02-10-25  星期六
 * @description
 */
public class A048回文数 {
	/*
	给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。
示例 1：

输入：x = 121
输出：true
示例 2：

输入：x = -121
输出：false
解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
示例 3：

输入：x = 10
输出：false
解释：从右向左读, 为 01 。因此它不是一个回文数。
	 */
	
	public static void main(String[] args) {
		A048回文数 demo = new A048回文数();
		System.out.println(demo.isPalindrome(123));
	}
	
	public boolean isPalindrome(int x) {
		String demo = String.valueOf(x);
		String builder = new StringBuilder(demo).reverse().toString();
		return builder.equals(demo);
	}
}
