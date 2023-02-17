package com.stleetcode.github.io.junw.practice.eee118机试题目;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author junw
 */

@Slf4j
public class huawei机考2 {
	public static void main(String[] args) {
		// 数独是一个我们都非常熟悉的经典游戏，运用计算机我们可以很快地解开数独难题，现在有一些简单的数独题目，请编写一个程序求解。
		// 如有多解，输出一个解
		// 输入9行，每行为空格隔开的9个数字，为0的地方就是需要填充的。
		// 输出九行，每行九个空格隔开的数字，为解出的答案。

		Scanner x = new Scanner(System.in);
		String x1 = x.nextLine();
		String x2 = Arrays.toString(x1.split(" "));
		System.out.println(x2);
		for (String i : x2.split("")) {
			if ("0".equals(i)) {
				log.info("避免if空体");
			}
		}


	}
}
