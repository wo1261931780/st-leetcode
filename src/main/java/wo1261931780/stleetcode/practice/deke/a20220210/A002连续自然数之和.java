package com.stleetcode.github.io.junw.practice.deke.a20220210;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2021/3/11
 * Time: 15:38
 * Description:
 * @author junw
 */
@Slf4j
public class A002连续自然数之和 {
	public static void main(String[] args) {
        /*
        一个整数可以由连续的自然数之和来表示
        给定一个整数
        计算该整数有几种连续自然数之和的表达式
        并打印出每一种表达式

        输入描述
        一个目标整数t  1<= t <=1000

        输出描述
        1.该整数的所有表达式和表达式的个数
        如果有多种表达式，自然数个数最少的表达式优先输出
        2.每个表达式中按自然数递增输出

        具体的格式参见样例
        在每个测试数据结束时，输出一行"Result:X"
        其中X是最终的表达式个数

        输入
        9

        输出
        9=9
        9=4+5
        9=2+3+4
        Result:3

        说明 整数9有三种表达方法：

        示例二
        输入
        10
        输出
        10=10
        10=1+2+3+4
        Result:2

         */

		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		log.info(t + "=" + t);

		ArrayList<String> res = new ArrayList<>();

		for (int n = 1; n < t; n++) {
			int sum = 0;
			StringBuilder builder = new StringBuilder();
			for (int i = n; sum < t; i++) {
				sum += i;
				builder.append(i).append("+");
				if (sum == t) {
					res.add(t + "=" + builder.substring(0, builder.length() - 1));
					break;
				}
			}
		}
		res.sort(Comparator.comparingInt(String::length));
		res.forEach(System.out::println);

		log.info("Result:" + (res.size() + 1));
		in.close();
	}
}
