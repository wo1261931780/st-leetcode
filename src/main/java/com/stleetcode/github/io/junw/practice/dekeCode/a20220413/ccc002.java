package com.stleetcode.github.io.junw.practice.dekeCode.a20220413;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa009_20220413
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-14  星期三
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在 ASCII 码范围内( 0~127 ，包括 0 和 127 )，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
 * 例如，对于字符串 abaca 而言，有 a、b、c 三种不同的字符，因此输出 3 。
 * @author junw
 */

@Slf4j
public class ccc002 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String demo = x.nextLine();
		Map<Character, Integer> map = new HashMap<>(20);
		for (int i = 0; i < demo.length(); i++) {
			char str = demo.charAt(i);
			map.put(str, 1);
		}
		Set<Character> demo2 = map.keySet();
		log.info(String.valueOf(demo2.size()));
	}
}
