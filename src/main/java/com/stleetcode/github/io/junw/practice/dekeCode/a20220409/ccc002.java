package com.stleetcode.github.io.junw.practice.dekeCode.a20220409;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa009_20220409
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-16-22  星期六
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 * <p>
 * 数据范围：保证结果在 1 \le n \le 2^{31}-1 \1≤n≤2
 * 31
 * ?1
 * @author junw
 */
@Slf4j
public class ccc002 {
	public static final Map<String, String> XX = new HashMap<>();

	static {
		XX.put("0", "0");
		XX.put("1", "1");
		XX.put("2", "2");
		XX.put("3", "3");
		XX.put("4", "4");
		XX.put("5", "5");
		XX.put("6", "6");
		XX.put("7", "7");
		XX.put("8", "8");
		XX.put("9", "9");
		XX.put("A", "10");
		XX.put("B", "11");
		XX.put("C", "12");
		XX.put("D", "13");
		XX.put("E", "14");
		XX.put("F", "15");
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String demoNum = x.nextLine();
		StringBuilder resBuilder = new StringBuilder();
		for (int i = 2; i < demoNum.length(); i++) {
			String demoStr = String.valueOf(demoNum.charAt(i));
			resBuilder.append(trans(demoStr, XX));
		}
		String res = resBuilder.toString();
		trans3(res);
		log.info(res);
	}

	public static String trans(String demo, Map<String, String> x) {
		// Set<Map.Entry<String, String>> show = x.entrySet();
		for (String s : x.keySet()) {
			if (x.get(s).equals(demo) || s.equals(demo)) {
				return trans2(x.get(s));
			}
		}
		return "";
	}

	public static void trans3(String result) {
		int result2 = 0;
		for (int i = 0, j = result.length() - 1; i < result.length(); i++, j--) {
			String demo = String.valueOf(result.charAt(j));
			// int pow_int = demo.equals("0") ? 0 : i;
			// double pow = Math.pow(2, pow_int);
			// 这里一开始就没搞懂二进制的运算原理
			double pow = "0".equals(demo) ? 0 : Math.pow(2, i);
			result2 += pow;
		}
		log.info(String.valueOf(result2));
	}

	public static String trans2(String num) {
		// int total_lenth = num.length();
		String result;
		String result2;

		int input = Integer.parseInt(num);
		StringBuilder resultBuilder1 = new StringBuilder();
		while (input >= 1) {
			// if (Integer.valueOf(num) % 2 == 0) {
			//     result += input % 2 == 0 ? "1" : "0";
			// } else {
			//     result += input % 2 == 0 ? "0" : "1";
			// }
			result2 = input % 2 == 0 ? "0" : "1";
			resultBuilder1.insert(0, result2);
			input /= 2;
		}
		result = resultBuilder1.toString();
		StringBuilder resultBuilder = new StringBuilder(result);
		while (resultBuilder.length() < 4) {
			resultBuilder.insert(0, "0");
		}
		result = resultBuilder.toString();
		return result;
		// log.info(result);
	}
}
// 0-1-2-3-4-5-6-7
// 0-1-0-1-0-1-0-1
// 1-2-1-8-1-32-1-128，这个是错的
// 0-2-0-8-0-32-0-128，这个是对的
