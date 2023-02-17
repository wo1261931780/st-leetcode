package com.stleetcode.github.io.junw.practice.dekeCode.a20220304;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa003_20220304
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-13-19  ÐÇÆÚÎå
 * @author junw
 */
@Slf4j
public class ccc004 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String demo1 = x.nextLine();
		String[] demo2 = demo1.split(" ");

		for (int i = demo2.length - 1; i >= 0; i--) {
			if (i == 0) {
				log.info(demo2[i]);
			} else {
				log.info(demo2[i] + " ");
			}
		}
	}
}
