package wo1261931780.stleetcode.practice.leetcode.a20230508;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230508
 *
 * @author liujiajun_junw
 * @Date 2023-05-14-13  星期一
 * @description
 */
public class A20230508005 {
	/**
	 * 描述
	 * 输入 n 个整型数，统计其中的负数个数并求所有非负数的平均值，结果保留一位小数，如果没有非负数，则平均值为0
	 * 本题有多组输入数据，输入到文件末尾。
	 * <p>
	 * 数据范围：
	 * 1
	 * ≤
	 * �
	 * ≤
	 * 50000
	 * <p>
	 * 1≤n≤50000  ，其中每个数都满足
	 * ∣
	 * �
	 * �
	 * �
	 * ∣
	 * ≤
	 * 1
	 * 0
	 * 6
	 * <p>
	 * ∣val∣≤10
	 * 6
	 * <p>
	 * 输入描述：
	 * 输入任意个整数，每行输入一个。
	 * <p>
	 * 输出描述：
	 * 输出负数个数以及所有非负数的平均值
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> objects = new ArrayList<>();
		ArrayList<Integer> objects2 = new ArrayList<>();
		while (scanner.hasNext()) {
			Integer integer = Integer.valueOf(scanner.next());
			if (integer > 0) {
				objects.add(integer);
			} else if (integer < 0) {
				objects2.add(integer);
			}
		}
		System.out.println(objects2.size());
		int sum = 0;
		for (Integer integer : objects) {
			sum += integer;
		}
		if (objects.size() > 0) {
			System.out.printf("%.1f%n", (double) sum / objects.size());
		} else {
			System.out.println(0.0);
		}
		sampleCode();
	}
	
	public static void sampleCode() {
		Scanner in = new Scanner(System.in);
		// 注意 hasNext 和 hasNextLine 的区别
		int temp = 0;
		int countN = 0;
		int countP = 0;
		double sum = 0.0;
		while (in.hasNextInt()) { // 注意 while 处理多个 case
			temp = in.nextInt();
			if (temp < 0) {
				countN++;
			} else if (temp > 0) {
				countP++;
				sum += temp;
			}
		}
		System.out.println(countN);
		if (countP == 0) {
			System.out.print("0.0");
		} else {
			System.out.printf("%.1f\n", sum / countP);
		}
	}
}
