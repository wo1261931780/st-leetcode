package com.stleetcode.github.io.junw.practice.eee118自己出题2;

import lombok.extern.slf4j.Slf4j;

import java.security.SecureRandom;
import java.util.ArrayList;
/**
 * @author junw
 */
@Slf4j
public class misDemoSort {
	public static void main(String[] args) {
		// 获得两个随机数字，参与数组排序，并展示结果
		ArrayList<Integer> x = new ArrayList<>();
		// Random x = new Random();
		SecureRandom x1 = new SecureRandom();
		int i = 0;
		while (i < 5) {
			int x2 = x1.nextInt(1000);
			x.add(x2);
			i++;
		}
		log.info(String.valueOf(x));
		// x.sort();
		for (i = 0; i < x.size(); i++) {
			int max;
			if (i + 1 < x.size()) {
				if (x.get(i) > x.get(i + 1)) {
					max = x.get(i);
					x.set(i, x.get(i + 1));
					x.set(i + 1, max);
					log.info("第" + i + "次：" + x);
				}
			}
		}
		log.info("结束：" + x);
	}
}
