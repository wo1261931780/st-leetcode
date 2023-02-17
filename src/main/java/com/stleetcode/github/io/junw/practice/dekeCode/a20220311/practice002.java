package com.stleetcode.github.io.junw.practice.dekeCode.a20220311;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa007_20220311
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-16-56  ÐÇÆÚÈÕ
 * @author junw
 */
@Slf4j
public class practice002 {
	public static void main(String[] args) {
		int[] x = {1, 23, 1, 2, 11};
		int mid;
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					mid = x[j];
					x[j] = x[i];
					x[i] = mid;
				}
			}
		}
		log.info(Arrays.toString(x));
	}
}
