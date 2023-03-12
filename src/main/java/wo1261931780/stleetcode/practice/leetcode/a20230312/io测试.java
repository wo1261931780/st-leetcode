package wo1261931780.stleetcode.practice.leetcode.a20230312;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

@Slf4j
public class io测试 {
	public static void main(String[] args) {
		int[] demo = new int[10];
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			demo[i] = random.nextInt(100) + 1;
		}
		log.info(Arrays.toString(demo));
		// log.info("******************");
		// rank(demo);
		// log.info("******************");
		// Arrays.sort(demo);
		// log.info(Arrays.toString(demo));
		log.info("******************");
		rankList(demo);
	}

	public static void rank(int[] demo) {
		for (int i = 0, mid = 0; i < demo.length; i++) {
			for (int j = 0; j < demo.length - i - 1; j++) {
				if (demo[j] > demo[j + 1]) {
					mid = demo[j];
					demo[j] = demo[j + 1];
					demo[j + 1] = mid;
				}
			}
		}
		log.info(Arrays.toString(demo));
	}

	public static void rankList(int[] demo) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i : demo) {
			arrayList.add(i);
		}
		arrayList.sort(Comparator.comparingInt(o -> o));
		log.info(arrayList.toString());
	}


}
