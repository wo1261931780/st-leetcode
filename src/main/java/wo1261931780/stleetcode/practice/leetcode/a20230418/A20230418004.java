package wo1261931780.stleetcode.practice.leetcode.a20230418;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230418
 *
 * @author liujiajun_junw
 * @Date 2023-04-15-39  星期二
 * @description
 */
public class A20230418004 {
	/**
	 * 描述
	 * 题目标题：
	 * <p>
	 * 将两个整型数组按照升序合并，并且过滤掉重复数组元素。
	 * 输出时相邻两数之间没有空格。
	 * <p>
	 * 输入描述：
	 * 输入说明，按下列顺序输入：
	 * 1 输入第一个数组的个数
	 * 2 输入第一个数组的数值
	 * 3 输入第二个数组的个数
	 * 4 输入第二个数组的数值
	 * <p>
	 * 输出描述：
	 * 输出合并之后的数组
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String[] split = scanner.nextLine().split(" ");
		String s2 = scanner.nextLine();
		String[] split2 = scanner.nextLine().split(" ");
		Set<Integer> set = new HashSet<>();
		Arrays.stream(split).forEach(s -> set.add(Integer.parseInt(s)));
		Arrays.stream(split2).forEach(s -> set.add(Integer.parseInt(s)));
		Object[] objects = set.toArray();
		Arrays.sort(objects);
		for (Object object : objects) {
			System.out.print(object);
		}
		sampleCode();
	}
	
	private static void sampleCode() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			Set<Long> set = new TreeSet<>();
			// 接收第一个整形数组大小
			int size1 = sc.nextInt();
			for (int i = 0; i < size1; i++) {
				set.add(sc.nextLong()); // 将该组的整数按数组大小循环添加进 set
			}
			// 接收第一个整形数组大小
			int size2 = sc.nextInt();
			for (int i = 0; i < size2; i++) {
				set.add(sc.nextLong());
			}
			// 遍历输出
			for (long n : set) {
				System.out.print(n);
			}
	      /*
	      注意：测试案例会以 两个整形数组 为一组测试用例， 并可能输入多组
	      要记得组与组的结果之间换行
	      */
			System.out.println();
		}
	}
}
