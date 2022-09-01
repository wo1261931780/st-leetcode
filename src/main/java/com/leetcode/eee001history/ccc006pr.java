package com.leetcode.eee001history;

import java.util.Scanner;

public class ccc006pr {
	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		String demo = x.nextLine();
		String showstr = "";
		char s = 98;

		for (int i = 0; i < demo.length(); i++) {
			System.out.println(demo.charAt(i));
			int x2 = demo.charAt(i) + 1 - 32;
			System.out.print(x2);
		}
	}
// --注释掉检查 START (2022-09-01 12:35):
//    public static void show(String x){
//        boolean matches = x.matches("\\w[a-z]");
//        boolean matches1 = x.matches("\\w[0-9]");
//        boolean matches2 = x.matches("\\w[A-Z]");
//        // sonarlint，必须设置返回值
//    }
// --注释掉检查 STOP (2022-09-01 12:35)
}
