package wo1261931780.stleetcode.practice.leetcode.a20230420;

import org.bouncycastle.math.Primes.STOutput;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230418.a20230420
 *
 * @author liujiajun_junw
 * @Date 2023-04-15-51  星期四
 * @description
 */
public class A20230420002 {
	/**
	 * 描述
	 * 求一个int类型数字对应的二进制数字中1的最大连续数，例如3的二进制为00000011，最大连续2个1
	 * <p>
	 * 数据范围：数据组数：
	 * 1
	 * ≤
	 * �
	 * ≤
	 * 5
	 * <p>
	 * 1≤t≤5 ，
	 * 1
	 * ≤
	 * �
	 * ≤
	 * 500000
	 * <p>
	 * 1≤n≤500000
	 * 进阶：时间复杂度：
	 * �
	 * (
	 * �
	 * �
	 * �
	 * �
	 * )
	 * <p>
	 * O(logn) ，空间复杂度：
	 * �
	 * (
	 * 1
	 * )
	 * <p>
	 * O(1)
	 * 输入描述：
	 * 输入一个int类型数字
	 * <p>
	 * 输出描述：
	 * 输出转成二进制之后连续1的个数
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nextInt = input.nextInt();
		String toBinaryString = Integer.toBinaryString(nextInt);
		String demo = "1";
		for (int i = 0; i < 1000000; i++) {
			if (toBinaryString.contains(demo)) {
				demo += "1";
			} else {
				System.out.println(i);
				return;
			}
		}
	}
	
}
