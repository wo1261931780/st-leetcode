package wo1261931780.stleetcode.practice.leetcode.a20230227;

import java.util.Arrays;

/**
 * 需求：某系统的数字密码，比如1983，采用加密方式进行传输，规则如下：先得到每位数，
 * 然后每位数都加上5再对10求余，最后将所有数字反转，得到一串新数。
 */
public class aaa057数字加密案例 {
	public static void main(String[] args) {
		// Scanner x = new Scanner(System.in);
		// System.out.println("请输入数字：");
		// int x1 = x.nextInt();

		int[] x = {8, 3, 4, 6};
		show(x);
	}

	// public static int[] show(int[] x) {
	//     int[] xx = new int[x.length];
	//     for (int i = 0; i < x.length; i++) {
	//         xx[i] += 5;
	//         xx[i] %= 10;
	//     }
	//     for (int i = xx.length, i1 = 0; i > i1; i--, i1++) {
	//         x[i1] = xx[i - 1];
	//     }
	//     System.out.println(Arrays.toString(xx));
	//
	//     return xx;
	// }
	public static int[] show(int[] x) {
		int[] xx = new int[x.length];
		for (int i = 0, i1 = x.length - 1; i < x.length; i++, i1--) {
			// int temp = x[i];
			xx[i1] = x[i];
			// 6,4,3,8
			xx[i1] += 10;
			xx[i1] -= 5;
			xx[i1] %= 10;
		}
		System.out.println(Arrays.toString(xx));
		return xx;
	}

}
