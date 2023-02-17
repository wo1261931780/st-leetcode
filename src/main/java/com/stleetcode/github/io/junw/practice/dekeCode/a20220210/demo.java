package com.stleetcode.github.io.junw.practice.dekeCode.a20220210;


import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;
/**
 * @author junw
 */
@Slf4j
public class demo {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String[] start = x.nextLine().split(" ");
		for (String i : start) {
			switch (i) {
				case "1" -> {
					log.info("1");
					show1();
				}
				case "2" -> log.info("2");
				case "3" -> log.info("1");
				case "4" -> log.info("2");
				case "5" -> log.info("1");
				default -> {
					log.info("默认块");
					return;
				}
			}
		}


	}

	public static void show1() {// A
		StringBuilder x = new StringBuilder();
		x.append("A");
	}

// --注释掉检查 START (2022-09-01 12:35):
// --注释掉检查 START (2022-09-01 12:35):
// --注释掉检查 START (2022-09-01 12:35):
//////    public static void show2() {// Ctrl-C
// --注释掉检查 START (2022-09-01 12:35):
////////    }
//////// --注释掉检查 STOP (2022-09-01 12:35)
//// --注释掉检查 STOP (2022-09-01 12:35)
//// --注释掉检查 STOP (2022-09-01 12:35)
//
//    public static void show3() {// Ctrl-X
//    }
//
//    public static void show4(StringBuilder x) {// Ctrl-V
// --注释掉检查 STOP (2022-09-01 12:35)

	// }

// --注释掉检查 START (2023/2/17 13:17):
//	public static StringBuilder show5(StringBuilder x) {// ¡¢Ctrl-A
//		if (x == null) {
//			return null;
//		} else {
//			return x;
//		}
//	}
// --注释掉检查 STOP (2023/2/17 13:17)

}
