package com.stleetcode.github.io.junw.practice.leetcode.a20230217;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode.github.io
 * Package:com.stleetcode.github.io.junw.practice.leetcode.a20230217
 *
 * @author liujiajun_junw
 * @Date 2023-02-20-45  星期五
 * @description
 */
public class A047两个括号 {
	public static void main(String[] args) {
		A047两个括号 demo = new A047两个括号();
		System.out.println(demo.isValid("){"));
	}

	public boolean isValid(String s) {
		// 首先，字符串一定是偶数的长度
		// 我们只需要判断右括号是否是对应的即可
		// 但是可能出现大括号包小括号的情况，所以直接一分为二，然后两个指针分别switch遍历即可
		if (s.length() % 2 != 0) {
			return false;
		}
		while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
			s = s.replace("()", "").replace("[]", "").replace("{}", "");
			if (s.equals("")) {
				return true;
			}
		}
		// 一开始我的思路就错了，直接一分为二，然后分别遍历，判断是否相等即可
		String substring = s.substring(0, s.length() / 2);
		String substring2 = s.substring(s.length() / 2);
		for (int i = 0, j = substring.length() - 1; i < substring.length(); i++, j--) {
			String s1 = String.valueOf(substring.charAt(i));
			String s2 = String.valueOf(substring2.charAt(j));
			if (!demo(s1, s2)) {
				return false;
			}
		}
		return true;
	}

	public boolean demo(String charAt, String charAt2) {
		switch (charAt) {
			case "(":
				if (!")".equals(charAt2)) {
					return false;
				}
				break;
			case "[":
				if (!"]".equals(charAt2)) {
					return false;
				}
				break;
			case "{":
				if (!"}".equals(charAt2)) {
					return false;
				}
				break;
			default:
				return false;
		}
		return true;
	}
}
