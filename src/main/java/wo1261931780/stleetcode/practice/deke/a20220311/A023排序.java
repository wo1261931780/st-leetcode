package com.stleetcode.github.io.junw.practice.deke.a20220311;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa007_20220311
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-15-22  ÐÇÆÚÈÕ
 * @author junw
 */
@Slf4j
public class A023排序 {
	public static void main(String[] args) {
		// int x=123;
		// // x.toString
		// log.info(x);
		// Integer x1=123;
		// String demp = x1.toString();
		// log.info(demp.length());
		// int demo1 = Integer.parseInt(demp);
		// log.info(demo1 == x);
		int[] x = {1, 23, 1, 412, 1, 25, 1, 5, 325, 46};
		// Arrays.sort(x);
		// log.info(Arrays.toString(x));
		// log.info(Arrays.binarySearch(x, 1));
		show(x);
	}

	public static void show(int[] x) {
		int mid;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length - i - 1; j++) {
				if (x[j] > x[j + 1]) {
					mid = x[j + 1];
					x[j + 1] = x[j];
					x[j] = mid;
				}
			}
		}
		log.info(Arrays.toString(x));
	}
}
