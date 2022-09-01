package com.leetcode.eee032统计字符串次数;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * 需求：
 * 键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
 * 举例：键盘录入“aababcabcdabcde”	在控制台输出：“a(5)b(4)c(3)d(2)e(1)”
 * 思路：
 * 1:键盘录入一个字符串
 * 2:创建HashMap集合，键是Character，值是Integer
 * 3:遍历字符串，得到每一个字符
 * 4:拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
 * 如果返回值是null：说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
 * 如果返回值不是null：说明该字符在HashMap集合中存在，把该值加1，然后重新存储该字符和对应的值
 * 5:遍历HashMap集合，得到键和值，按照要求进行拼接
 * 6:输出结果
 */
public class 测试类 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("开始");
		String x1 = x.nextLine();
		HashMap<Character, Integer> x2 = new HashMap<>();
		for (int i = 0; i < x1.length(); i++) {
			Character x3 = x1.charAt(i);
			Integer x4 = x2.get(x3);
			if (x4 == null) {
				x2.put(x3, 1);
			} else {
				x4++;
				x2.put(x3, x4);
			}
		}
		System.out.println(x2);
		StringBuilder x6 = new StringBuilder();
		Set<Character> x5 = x2.keySet();
		for (Character x7 : x5) {
			x6.append(x7).append("(").append(x2.get(x7)).append(")").append("-");
		}
		System.out.println(x6);
	}
}
