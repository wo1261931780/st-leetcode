package wo1261931780.stleetcode.practice.leetcode.a20230227;

import java.util.Random;

/**
 * 需求：定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。
 */
public class aaa054验证码 {
	public static void main(String[] args) {
		System.out.println(show(5));
		System.out.println("end");
	}

	public static String show(int n) {
		// 方法都是具备返回值的，因为方法的结果后续可能在其他地方被调用
		String x = "";
		Random xx = new Random();
		for (int i = 0; i < n; i++) {
			int x1 = xx.nextInt(3);
			if (x1 == 0) {
				int x2 = xx.nextInt(10) + 48;
				x += (char) x2 + "";
			} else if (x1 == 1) {
				int x2 = xx.nextInt(26) + 65;
				x += (char) x2 + "";
			} else {
				int x2 = xx.nextInt(26) + 97;
				x += (char) x2 + "";
			}
		}
		return x;
	}
}
