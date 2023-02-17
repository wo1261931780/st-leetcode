package com.stleetcode.github.io.junw.practice.deke.a20220304;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa003_20220304
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-13-10  ÐÇÆÚÎå
 * @author junw
 */
@Slf4j
public class ccc003 {
	public static void main(String[] args) {
		Scanner x1 = new Scanner(System.in);
		while (x1.hasNext()) {
			int index = x1.nextInt();
			// int index=(x-2)/3+1;
			int an = 2 + 3 * (index - 1);
			int sum = index * (an + 2) / 2;
			log.info(String.valueOf(sum));
		}

	}
}
