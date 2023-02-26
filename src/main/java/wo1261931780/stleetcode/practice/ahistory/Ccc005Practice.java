package com.stleetcode.github.io.junw.practice.ahistory;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author junw
 */
@Slf4j
public class Ccc005Practice {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int x1 = x.nextInt();
		int x1Len = 1 + x1 / 2;
		Scanner xx = new Scanner(System.in);
		String x2 = xx.nextLine();
		Scanner xxx = new Scanner(System.in);
		int x3 = xxx.nextInt();
		if (x3 == 0) {
			rank1(split1(x2, x1Len), x3);
		} else {
			// 这里做法一样，
			// 最大的问题是，返回的数组需要插入空格，语法不了解
			log.info("避免if空体");
		}
	}

	public static void rank1(int[] xx, int x3) {
		for (int i = 0; i < xx.length - 1; i++) {
			int mid = 0;
			for (int j = 0; j < xx.length - i - 1; j++) {
				mid = xx[j] > xx[j + 1] ? xx[j + 1] : mid;
				xx[j + 1] = xx[j];
				xx[j] = mid;
			}
		}
		log.info(Arrays.toString(xx));
	}

	public static int[] split1(String xx, int x1Len) {
		int[] x1 = new int[x1Len];
		for (int i = 0, j = 0; i < xx.length(); i += 2, j++) {
			x1[j] = xx.charAt(i);
		}
		return x1;
	}
}
