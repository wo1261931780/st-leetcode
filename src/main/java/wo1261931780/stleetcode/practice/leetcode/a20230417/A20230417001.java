package wo1261931780.stleetcode.practice.leetcode.a20230417;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230416.a20230417
 *
 * @author liujiajun_junw
 * @Date 2023-04-10-30  星期一
 * @description
 */
public class A20230417001 {
	/**
	 * 描述
	 * 某商店规定：三个空汽水瓶可以换一瓶汽水，允许向老板借空汽水瓶（但是必须要归还）。
	 * 小张手上有n个空汽水瓶，她想知道自己最多可以喝到多少瓶汽水。
	 * 数据范围：输入的正整数满足
	 * 1
	 * ≤
	 * �
	 * ≤
	 * 100
	 * <p>
	 * 1≤n≤100
	 * <p>
	 * 注意：本题存在多组输入。输入的 0 表示输入结束，并不用输出结果。
	 * 输入描述：
	 * 输入文件最多包含 10 组测试数据，每个数据占一行，仅包含一个正整数 n（ 1<=n<=100 ），表示小张手上的空汽水瓶数。n=0 表示输入结束，你的程序不应当处理这一行。
	 * <p>
	 * 输出描述：
	 * 对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		while (scanner.hasNextLine()) {
			String nextLine = scanner.nextLine();
			if ("0".equals(nextLine)) {
				break;
			}
			int n = Integer.parseInt(nextLine);
			arrayList.add(n);
		}
		for (Integer n : arrayList) {
			int count = 0;
			while (n >= 3) {
				count += n / 3;
				n = n / 3 + n % 3;
			}
			if (n == 2) {
				count++;
			}
			System.out.println(count);
		}
		sampleCode1();// 代码简洁
	}
	
	private static void sampleCode1() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int bottle = sc.nextInt();
			if (bottle == 0) {
				break;
			}
			System.out.println(bottle / 2);
		}
	}
}
