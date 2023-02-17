package com.stleetcode.github.io.junw.practice.deke.a20220831;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode.github.io
 * Package:com.stleetcode.github.io.junw.practice.deke.a20220901
 *
 * @author liujiajun_junw
 * @Date 2023-02-16-23  星期五
 * @description
 */
@Slf4j
public class A037字符串拼接测试 {

	static String str = "good";
	static char[] ch = {'a', 'b', 'c'};

	public static void main(String[] args) {
		A037字符串拼接测试 ex = new A037字符串拼接测试();
		A037字符串拼接测试.exchange(A037字符串拼接测试.str, A037字符串拼接测试.ch);
		log.info(A037字符串拼接测试.str + "and");
		// log.info(a.ch);
	}

	public static void exchange(String str, char[] ch) {
		String newStr = "A040两种通配符的字符串的匹配功能 ok";
		ch[0] = 'g';
	}
}
