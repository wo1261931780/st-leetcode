package com.stleetcode.github.io.junw.practice.eee118机试题目;

import lombok.extern.slf4j.Slf4j;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.TreeSet;
/**
 * @author junw
 */

@Slf4j
public class 抽样和排序 {
    /*
    明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
    对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排
    好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据(用于不同的调查)，希望大家能正确处理)。
注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。
当没有新的输入时，说明输入结束。
    */

	public static void main(String[] args) {
		// Random x = new Random();
		SecureRandom x = new SecureRandom();
		Scanner xx = new Scanner(System.in);
		int xx1 = xx.nextInt();
		int i = 0;
		TreeSet<Object> x2 = new TreeSet<>();
		while (i < xx1) {
			int x1 = x.nextInt(1000) + 1;
			System.out.println(x1);
			x2.add(x1);
			i++;
		}
		log.info("-----");
		for (Object i1 : x2) {
			System.out.println(i1);
		}


	}
}
