package com.stleetcode.github.io.junw.practice.deke.a20220304;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa003_20220304
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-22-05  ÐÇÆÚÎå
 * @author junw
 */

public class ccc005 {
	public static void main(String[] args) {
		int[] x = {1, 34, 56, 4, 96, 8, 8, 7, 9};
		int max = 0;
		for (int j : x) {
			// max = max > j ? max : j;
			// 直接用表达式替换掉
			max = Math.max(max, j);
		}
	}
}
