package com.stleetcode.github.io.junw.practice.eee032统计字符串次数;
/*
    需求：
        键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
        举例：键盘录入“aababcabcdabcde”	在控制台输出：“a(5)b(4)c(3)d(2)e(1)”

    思路：
        1:键盘录入一个字符串
        2:创建HashMap集合，键是Character，值是Integer
        3:遍历字符串，得到每一个字符
        4:拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
            如果返回值是null：说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
            如果返回值不是null：说明该字符在HashMap集合中存在，把该值加1，然后重新存储该字符和对应的值
        5:遍历HashMap集合，得到键和值，按照要求进行拼接
        6:输出结果
 */

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
/**
 * @author junw
 */

@Slf4j
public class eee033统计字符串次数 {
	public static void main(String[] args) {
		// HashMap<Character, Integer> x = new HashMap<>();
		// 储存格式为hashmap，
		// 字符作为键，次数作为值
		// 最终展示为x=22;
		TreeMap<Character, Integer> x = new TreeMap<>();
		// TreeMap的好处在于，对键进行了排序
		// ---------------------------------------------------------
		Scanner x1 = new Scanner(System.in);
		log.info("请输入字符串：");
		String zfc = x1.nextLine();
		// String[] x2 = zfc.split("");
		for (int i = 0; i < zfc.length(); i++) {
			Character x3 = zfc.charAt(i);
			Integer value = x.get(x3);
			// 直接使用int定义会出错，必须使用完整的包装类
			if (value == null) {
				x.put(x3, 1);
			} else {
				// x.put(x3, value++);
				value++;
				x.put(x3, value);
				// 如果直接运行，就会报错
			}
		}
		log.info(String.valueOf(x));
		Set<Character> x4 = x.keySet();
		StringBuilder x6 = new StringBuilder();
		for (Character i : x4) {
			x6.append(i).append("(").append(x.get(i)).append(")").append("-");
		}
		log.info(String.valueOf(x6));

	}
}
