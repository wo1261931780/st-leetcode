package com.stleetcode.github.io.junw.practice.a001history;

import lombok.extern.slf4j.Slf4j;

import java.security.SecureRandom;
import java.util.Scanner;

// public class Ccc001Demo {
//     public static void main(String[] args) {
//         Scanner x=new Scanner(System.in);
//         int x1 = x.nextInt();
//         log.info(x1);
//     }
// }

// public class Ccc001Demo {
//     public static void main(String[] args) {
//         Scanner x = new Scanner(System.in);
//         log.info("请输入数据:");
//         double demo_num = x.nextDouble();
//         int demo_x = (int) demo_num;
//         log.info(demo_x);
//
//     }
// }
// 2022年2月7日20:53:32，力扣刷题两道

/**
 * @author junw
 */
@Slf4j
public class Ccc001Demo {
	public static void main(String[] args) {
		Scanner xInput = new Scanner(System.in);
		int demo = xInput.nextInt();
		int[] x = new int[demo];
		// Random x1 = new Random();
		SecureRandom x1 = new SecureRandom();
		for (int i = 0; i < x.length; i++) {
			int demoNum = x1.nextInt(999) + 1;
			for (int i1 = 0; i1 < x.length; i1++) {
				if (x[i1] == demoNum) {
					log.info("避免if空体");
				} else {
					x[i] = demoNum;
				}
			}
		}
		rank(x);
	}

	public static void rank(int[] x) {
		for (int i = 0, max; i < x.length - 1; i++) {
			for (int i1 = 0; i1 < x.length - i - 1; i1++) {
				if (x[i1] > x[i1 + 1]) {
					max = x[i1];
					x[i1] = x[i1 + 1];
					x[i1 + 1] = max;
				}
			}
		}
		for (int j : x) {
			log.info(String.valueOf(j));
		}
	}
}
