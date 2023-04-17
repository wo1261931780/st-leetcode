package wo1261931780.stleetcode.practice.leetcode.a20230417;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230417
 *
 * @author liujiajun_junw
 * @Date 2023-04-15-52  星期一
 * @description
 */
public class A20230417005 {
	/**
	 * 描述
	 * 蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
	 * <p>
	 * 例如，当输入5时，应该输出的三角形为：
	 * <p>
	 * 1 3 6 10 15
	 * <p>
	 * 2 5 9 14
	 * <p>
	 * 4 8 13
	 * <p>
	 * 7 12
	 * <p>
	 * 11
	 * <p>
	 * <p>
	 * 输入描述：
	 * 输入正整数N（N不大于100）
	 * <p>
	 * 输出描述：
	 * 输出一个N行的蛇形矩阵。
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		// int nextInt = scanner.nextInt();
		// int[] arr = new int[nextInt];
		// int num = 1;
		// System.out.print(num + " ");
		// for (int i = 1; i < arr.length; i++) {
		// 	num += i;
		// 	// System.out.print(arr[i]);
		// 	System.out.print(num + i + " ");
		// }
		// 2023年4月17日16:17:48，没有完成，看下代码
		
		// int totalNum = (1 + nextInt) * (nextInt - 1) / 2;// 高斯算法
		sampleCode();
		
	}
	
	private static void sampleCode() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n][n];
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = i; j >= 0; j--) {
				arr[j][i - j] = num++;
			}
		}// 完成数组的赋值
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {// 遍历展示数组
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
