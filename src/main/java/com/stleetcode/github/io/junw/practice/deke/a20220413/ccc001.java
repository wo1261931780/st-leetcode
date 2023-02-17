package com.stleetcode.github.io.junw.practice.deke.a20220413;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa009_20220413
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-12-57  星期三
 * @author junw
 */
// 输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
// 保证输入的整数最后一位不是 0 。按照从右向左的阅读顺序，返回一个不含重复数字的新的整数

@Slf4j
public class ccc001 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int demo = x.nextInt();
		show(demo);
	}

	public static void show(int demo) {
		String x1 = demo + "";
		Set<String> x = new LinkedHashSet<>();
		for (int i = x1.length() - 1; i >= 0; i--) {
			char xx = x1.charAt(i);
			if (xx == '0' && i == x1.length() - 1) {
				log.info("避免if空体");
			} else {
				x.add(xx + "");
			}
		}
		x.forEach(System.out::print);
	}
}
