package com.leetcode.eee002deke_code.aaa009_20220411;

import java.util.*;

/**
 * Created by Intellij IDEA.
 * Project:tfb-biz-2021
 * Package:com.eternalinfo.tfb.config.sg
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-18-48  星期一
 * 数据表记录包含表索引index和数值value（int范围的正整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照index值升序进行输出。
 * <p>
 * <p>
 * 提示:
 * 0 <= index <= 11111111
 * 1 <= value <= 100000
 * <p>
 * 输入描述：
 * 先输入键值对的个数n（1 <= n <= 500）
 * 接下来n行每行输入成对的index和value值，以空格隔开
 * <p>
 * 输出描述：
 * 输出合并后的键值对（多行）
 * 4
 * 0 1
 * 0 2
 * 1 2
 * 3 4
 * <p>
 * 0 3
 * 1 2
 * 3 4
 */
public class demorun {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();

		Scanner x = new Scanner(System.in);
		String ori_str = x.nextLine();
		int second = Integer.parseInt(ori_str);

		for (int i = 0; i < second; i++) {
			String demo_str = x.nextLine();
			// int str1 = Integer.parseInt(demo_str.substring(0, 1));
			// int str2 = Integer.parseInt(demo_str.substring(2, 3));
			String[] str_list = demo_str.split(" ");
			int str1 = Integer.parseInt(str_list[0]);
			int str2 = Integer.parseInt(str_list[1]);
			show(map, str1, str2);
			// System.out.println(str1);
		}
		show2(map);


	}

	public static void show(Map<Integer, Integer> x, int str1, int str2) {
		// Set<Integer> demo = x.keySet();
		// for (Integer integer : demo) {
		//     if (str1 == integer) {
		//         int res = x.get(str1) + str2;
		//         x.put(str1, res);
		//     }
		// }
		if (x.get(str1) != null) {
			int res = x.get(str1) + str2;
			x.put(str1, res);
		} else {
			x.put(str1, str2);
		}
	}

	public static void show2(Map<Integer, Integer> x) {
		// x.forEach((s1, s2) -> System.out.println(s1 + " " + s2));
		Set<Map.Entry<Integer, Integer>> demo = x.entrySet();
		demo.stream().sorted((o1, o2) -> o1.getKey() - o2.getKey()).forEach(s1 -> System.out.println(s1.getKey() + " " + x.get(s1.getKey())));
	}
}
