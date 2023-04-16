package wo1261931780.stleetcode.practice.leetcode.a20230416;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230416
 *
 * @author liujiajun_junw
 * @Date 2023-04-19-04  星期日
 * @description
 */
public class A20230416002 {
	/**
	 * 描述
	 * 输入n个整数，找出其中最小的k个整数并按升序输出
	 * <p>
	 * 本题有多组输入样例
	 * <p>
	 * 数据范围：
	 * 1
	 * ≤
	 * �
	 * ≤
	 * 1000
	 * <p>
	 * 1≤n≤1000  ，输入的整数满足
	 * 1
	 * ≤
	 * �
	 * �
	 * �
	 * ≤
	 * 10000
	 * <p>
	 * 1≤val≤10000
	 * 输入描述：
	 * 第一行输入两个整数n和k
	 * 第二行输入一个整数数组
	 * <p>
	 * 输出描述：
	 * 从小到大输出最小的k个整数，用空格分开。
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		String[] split = nextLine.split(" ");// 参数
		String nextLine1 = scanner.nextLine();// 数组
		String[] split1 = nextLine1.split(" ");
		int[] arr = new int[split1.length];
		for (int i = 0; i < split1.length; i++) {
			arr[i] = Integer.parseInt(split1[i]);
		}
		Arrays.sort(arr);// 排序
		for (int i = 0; i < Integer.parseInt(split[1]); i++) {
			System.out.print(arr[i] + " ");
		}
		sampleCode();// 参考代码
	}
	
	/**
	 * 参考代码
	 */
	public static void sampleCode() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			for (int i = 0; i < k; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
}
