package com.stleetcode.github.io.junw.practice.ahistory;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;
/**
 * @author junw
 */
@Slf4j
public class DemoLeetcode {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		while (x.hasNextInt()) {// 自动判断是否有输入，
			// 同时设置死循环，重复调用命令
			int typeNum = x.nextInt();
			run(typeNum);
		}
	}

	public static void run(int typeNum) {
		int num = 0;
		for (int i = 1; i <= typeNum; i++) {
			// j = test_num(i, num);
			if (testNum(i, num) != num) {
				num++;
			}
		}
		log.info(String.valueOf(num));
	}

	public static int testNum(int x, int num) {
		// int x = 28;
		int j = 0;
		// int num = 0;
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				j += i;
			}
		}
		if (j == x) {
			num++;
		}
		return num;
	}
}
