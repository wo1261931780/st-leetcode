package wo1261931780.stleetcode.practice.leetcode.a20230416;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230416
 *
 * @author liujiajun_junw
 * @Date 2023-04-19-23  星期日
 * @description
 */
public class A20230416003 {
	/**
	 * 描述
	 * 输入整型数组和排序标识，对其元素按照升序或降序进行排序
	 * <p>
	 * 数据范围：
	 * 1
	 * ≤
	 * �
	 * ≤
	 * 1000
	 * <p>
	 * 1≤n≤1000  ，元素大小满足
	 * 0
	 * ≤
	 * �
	 * �
	 * �
	 * ≤
	 * 100000
	 * <p>
	 * 0≤val≤100000
	 * 输入描述：
	 * 第一行输入数组元素个数
	 * 第二行输入待排序的数组，每个数用空格隔开
	 * 第三行输入一个整数0或1。0代表升序排序，1代表降序排序
	 * <p>
	 * 输出描述：
	 * 输出排好序的数字
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		// String nextLine1 = scanner.nextLine();
		// String nextLine2 = scanner.nextLine();
		// String[] split = nextLine2.split(" ");
		// int[] arr = new int[Integer.parseInt(nextLine1)];
		// for (int i = 0; i < split.length; i++) {
		// 	arr[i] = Integer.parseInt(split[i]);
		// }
		// Arrays.sort(arr);
		//
		// String nextLine3 = scanner.nextLine();
		//
		// if (Integer.parseInt(nextLine3) == 0) {
		// 	// 升序
		// 	for (int i : arr) {
		// 		System.out.print(i + " ");
		// 	}
		// } else {
		// 	// 降序
		// 	for (int i = arr.length - 1; i >= 0; i--) {
		// 		System.out.print(arr[i] + " ");
		// 	}
		// }
		sampleCode();
		
	}
	
	/**
	 * 参考代码
	 */
	public static void sampleCode() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();// 接收数组长度
			int[] arr = new int[n];// 创建数组
			
			for (int i = 0; i < n; i++) {// 数组填入
				arr[i] = sc.nextInt();
			}
			
			int flag = sc.nextInt();// 接收排序标识
			Arrays.sort(arr);// 数组排序
			
			if (flag == 0) {// 正序输出
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
			} else {// 逆序输出
				for (int i = arr.length - 1; i >= 0; i--) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
