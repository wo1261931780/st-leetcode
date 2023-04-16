package wo1261931780.stleetcode.practice.leetcode.a20230416;


import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

import static wo1261931780.stleetcode.practice.other.FinalVar.FINAL_SPLIT;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230416
 *
 * @author liujiajun_junw
 * @Date 2023-04-18-38  星期日
 * @description
 */
@Slf4j
public class A20230416001 {
	
	/**
	 * 描述
	 * 输入一个字符串和一个整数 k ，截取字符串的前k个字符并输出
	 * <p>
	 * 数据范围：字符串长度满足
	 * 1
	 * ≤
	 * �
	 * ≤
	 * 1000
	 * <p>
	 * 1≤n≤1000  ，
	 * 1
	 * ≤
	 * �
	 * ≤
	 * �
	 * <p>
	 * 1≤k≤n
	 * 输入描述：
	 * 1.输入待截取的字符串
	 * <p>
	 * 2.输入一个正整数k，代表截取的长度
	 * <p>
	 * 输出描述：
	 * 截取后的字符串
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		log.info("请输入一个字符串");
		String nextLine = scanner.nextLine();
		int nextLine2 = scanner.nextInt();
		log.info(nextLine);
		log.info(nextLine2 + "");
		log.info(FINAL_SPLIT);
		log.info(nextLine.substring(0, nextLine2));
		System.out.println();
		sampleCode();// 优秀代码
	}
	
	/**
	 * 优秀代码
	 */
	public static void sampleCode() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// 输入字符串和k
			String str = sc.next();
			int k = sc.nextInt();
			// 直接使用String的substring方法输出结果
			System.out.println(str.substring(0, k));
		}
	}
}
