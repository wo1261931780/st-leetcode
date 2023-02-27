package wo1261931780.stleetcode.practice.leetcode.a20230227;

import java.util.Random;

/**
 * 需求：机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
 * 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
 */
public class aaa052机票案例 {
	public static void main(String[] args) {
		show();
		System.out.println("finish");
		System.out.println("--------------------");
		// 在淡季乘坐头等舱
		show(1, 1);

	}
	// 需要设置方法重载
	// 没有任何信息，默认调用原价和经济舱
	// 否则就使用带有信息的方法

	/**
	 * 不登录账号的情况下，直接展示旺季经济舱机票的原价
	 */
	public static void show() {
		show(5, 0);
	}

	public static void show(int x1, int x2) {
		Random price = new Random();
		int x3 = price.nextInt(1000) + 1000;
		System.out.println("original price:" + x3);
		System.out.println("**********");
		if (x1 < 0 || x1 > 12) {
			System.out.println("error");
			return;// 直接结束方法的执行
		}
		if (x1 > 5 || x1 < 10) {
			System.out.println("Peak Season");
			double price2 = x2 == 1 ? x3 * 0.9 : x3 * 0.85;
			System.out.println(x1 + "月的price=" + price2);
		} else {
			System.out.println("Off-season");
			double price2 = x2 == 1 ? x3 * 0.7 : x3 * 0.65;
			System.out.println(x1 + "月的price=" + price2);
		}
	}

}
