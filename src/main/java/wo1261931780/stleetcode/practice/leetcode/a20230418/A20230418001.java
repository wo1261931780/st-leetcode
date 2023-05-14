package wo1261931780.stleetcode.practice.leetcode.a20230418;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230418
 *
 * @author liujiajun_junw
 * @Date 2023-04-14-13  星期二
 * @description
 */
public class A20230418001 {
	/**
	 * 描述
	 * 任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，本题目要求输出组成指定偶数的两个素数差值最小的素数对。
	 * <p>
	 * 数据范围：输入的数据满足
	 * 4
	 * ≤
	 * �
	 * ≤
	 * 1000
	 * <p>
	 * 4≤n≤1000
	 * 输入描述：
	 * 输入一个大于2的偶数
	 * <p>
	 * 输出描述：
	 * 从小到大输出两个素数
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		int random = nextInt / 2;
		int i = random;
		int j = random;
		while (true) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (j == i) {
				System.out.println(j);
				System.out.println(nextInt - j);
				break;
			}
			i--;
		}
		// 代码失败，108无法分析53和55
		
		sampleCode();
	}
	
	public static void sampleCode() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = scanner.nextInt();
			demo1(num);
		}
	}
	
	public static void demo1(int num) {
		// 如num=10, 遍历:5,6,7,8
		// 从最接近的两个中位数开始处理判断
		for (int i = num / 2; i < num - 1; i++) {
			if (isPrime(i) && isPrime(num - i)) {
				System.out.println((num - i) + "\n" + i);
				return;
			}
		}
	}
	
	// 判断是否素数
	public static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
