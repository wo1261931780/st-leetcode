package wo1261931780.stleetcode.practice.ahistory;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-10-46  星期五
 *
 * @author junw
 */

/*
描述
连续输入字符串，请按长度为8拆分每个输入字符串并进行输出；
长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
（注：本题有多组输入）
输入描述：
连续输入字符串(输入多次,每个字符串长度小于等于100)

输出描述：
依次输出所有分割后的长度为8的新字符串
abc
123456789
输出：
abc00000
12345678
90000000
 */

@Slf4j
public class Ccc20220218 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		while (x.hasNext()) {
			String x1 = x.nextLine();
			show(x1);
		}
	}
	
	public static void show(String x1) {
		int x2 = x1.length();
		if (x2 <= 8 && x2 > 0) {
			// for (int i = 0; i < 8 - x2; i++) {
			// 	x1Builder.append("0");
			// }
			// 使用jdk11的新特性，将其替换为下面的代码
			x1 = x1 + "0".repeat(8 - x2);
			log.info(x1);
		} else {
			log.info(x1.substring(0, 8));
			show(x1.substring(8, x2));
		}
		// log.info(x1);
	}
}
