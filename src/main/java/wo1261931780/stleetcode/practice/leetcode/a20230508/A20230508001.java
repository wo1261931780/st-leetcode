package wo1261931780.stleetcode.practice.leetcode.a20230508;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230506.a20230508
 *
 * @author liujiajun_junw
 * @Date 2023-05-10-15  星期一
 * @description
 */
public class A20230508001 {
	/**
	 * 描述
	 * 首先输入要输入的整数个数n，然后输入n个整数。输出为n个整数中负数的个数，和所有正整数的平均值，结果保留一位小数。
	 * 0即不是正整数，也不是负数，不计入计算。如果没有正数，则平均值为0。
	 * <p>
	 * 数据范围：
	 * 1
	 * ≤
	 * �
	 * <p>
	 * ≤
	 * 2000
	 * <p>
	 * 1≤n ≤2000  ，输入的整数都满足
	 * ∣
	 * �
	 * �
	 * �
	 * ∣
	 * ≤
	 * 1000
	 * <p>
	 * ∣val∣≤1000
	 * 输入描述：
	 * 首先输入一个正整数n，
	 * 然后输入n个整数。
	 * <p>
	 * 输出描述：
	 * 输出负数的个数，和所有正整数的平均值。
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nextInt = Integer.parseInt(scanner.nextLine());
		String[] s = scanner.nextLine().split(" ");
		List<Integer> ints1 = new ArrayList<>();
		int avg = 0;// 平均数
		int countNumber = 0; // 负数的个数
		for (String value : s) {
			int parseInt = Integer.parseInt(value);
			if (parseInt > 0) {
				ints1.add(parseInt);
				avg += parseInt;
			}
			countNumber = parseInt < 0 ? countNumber + 1 : countNumber;
		}
		if (ints1.size() == 0) {
			System.out.print(countNumber + " " + 0.0);
		} else {
			System.out.print(countNumber + " " + String.format("%.1f", avg * 1.0 / ints1.size()));
		}
		sampleCode();
	}
	
	private static void sampleCode() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int countNegative = 0;
			int countPositive = 0;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int number = sc.nextInt();
				if (number < 0) {
					countNegative++;
				} else if (number > 0) {
					sum += number;
					countPositive++;
				}
			}
			double average = countPositive == 0 ? 0.0 : sum * 1.0 / countPositive;
			System.out.println(countNegative + " " + String.format("%.1f", average));
		}
		sc.close();
	}
	
}
