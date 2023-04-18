package wo1261931780.stleetcode.practice.leetcode.a20230418;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230418
 *
 * @author liujiajun_junw
 * @Date 2023-04-16-19  星期二
 * @description
 */
public class A20230418006 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int count = 0;
			int s = scanner.nextInt();
			// String t = scanner.next();
			while (s != 1) {
				if (s % 2 == 1) {
					count++;
				}
				s = s / 2;
				// System.out.println(s);
			}
			count++;
			System.out.println(count);
		}
		sampleCode();
	}
	public static void sampleCode(){
		Scanner in = new Scanner(System.in);
		// 注意 hasNext 和 hasNextLine 的区别
		while (in.hasNextInt()) { // 注意 while 处理多个 case
			int a = in.nextInt();
			String b=Integer.toBinaryString(a);
			// String c=b.replaceAll("1","");
			// System.out.println(b.length()-c.length());
			// 下面的方法更快
			System.out.println(Integer.bitCount(a));// Integer.bitCount()方法可以直接计算二进制中1的个数
			// 妈的，这个方法我居然没想到
		}
	}
}
