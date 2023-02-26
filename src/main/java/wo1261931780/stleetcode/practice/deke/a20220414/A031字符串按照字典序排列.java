package com.stleetcode.github.io.junw.practice.deke.a20220414;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa009_20220414
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-12-51  星期四
 * <p>
 * 给定 n 个字符串，请对 n 个字符串按照字典序排列。
 * <p>
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * <p>
 * 数据输出n行，输出结果为按照字典序排列的字符串。
 *
 * @author junw
 */
public class A031字符串按照字典序排列 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String num = x.nextLine();
		// Set<String> x1 = new TreeSet<>();
		// for (int i = 0; i < Integer.valueOf(num); i++) {
		//     String A021测试时间Api = x.nextLine();
		//     x1.add(A021测试时间Api);
		// }
		// 为了保证字符串可以重复，这里就使用list类型的
		List<String> x1 = new ArrayList<>();
		for (int i = 0; i < Integer.parseInt(num); i++) {
			String demo = x.nextLine();
			x1.add(demo);
		}
		x1.stream().sorted().forEach(System.out::println);
		// x1.forEach(System.out::println);
	}
}
