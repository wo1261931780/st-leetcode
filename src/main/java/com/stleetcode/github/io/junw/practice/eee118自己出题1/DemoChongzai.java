package com.stleetcode.github.io.junw.practice.eee118自己出题1;

import lombok.extern.slf4j.Slf4j;
/**
 * @author junw
 */


@Slf4j
public class DemoChongzai {
	public static void main(String[] args) {
		show(1);
		show(1, 2);
		show(1, 2, 3);
		log.info("结束");
	}

	public static void show(int x) {
		log.info(String.valueOf(x));
	}

	public static void show(int x, int y) {
		log.info(String.valueOf(x + y));
	}

	public static void show(int x, int y, int z) {
		log.info(String.valueOf(x + y + z));
	}
}
