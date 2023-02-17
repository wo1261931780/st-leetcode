package com.stleetcode.github.io.junw.practice.dekeCode.a20220311;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa007_20220311
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-13-30  ÐÇÆÚÎå
 * @author junw
 */

public class demo {
	public static void main(String[] args) {
		LocalDate x = LocalDate.now();
		System.out.println(x);// 2022-03-11
		int demoYear = x.getYear();
		System.out.println(demoYear);// 2022
		System.out.println(x.getDayOfWeek().getValue());
		System.out.println(x.getDayOfWeek());
		System.out.println(x.getDayOfMonth());
		System.out.println(x.getDayOfYear());


		// LocalDateTime x1=LocalDateTime.now();
		// LocalDate demo_time = x1.toLocalDate();
		LocalDate demoTime = LocalDateTime.now().toLocalDate();//
		System.out.println(demoTime);


	}
}
