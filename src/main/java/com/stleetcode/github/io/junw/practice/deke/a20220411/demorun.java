package com.stleetcode.github.io.junw.practice.deke.a20220411;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
/**
 * @author junw
 */
@Slf4j
public class demorun {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>(20);

		Scanner x = new Scanner(System.in);
		String oriStr = x.nextLine();
		int second = Integer.parseInt(oriStr);

		for (int i = 0; i < second; i++) {
			String demoStr = x.nextLine();
			// int str1 = Integer.parseInt(demo_str.substring(0, 1));
			// int str2 = Integer.parseInt(demo_str.substring(2, 3));
			String[] strList = demoStr.split(" ");
			int str1 = Integer.parseInt(strList[0]);
			int str2 = Integer.parseInt(strList[1]);
			show(map, str1, str2);
			// log.info(str1);
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
		// x.forEach((s1, s2) -> log.info(s1 + " " + s2));
		Set<Map.Entry<Integer, Integer>> demo = x.entrySet();
		demo.stream().sorted(Comparator.comparingInt(Entry::getKey)).forEach(s1 -> log.info(s1.getKey() + " " + x.get(s1.getKey())));
		// demo.stream().sorted((o1, o2) -> o1.getKey() - o2.getKey()).forEach(s1 -> log.info(s1.getKey() + " " + x.get(s1.getKey())));
	}
}
