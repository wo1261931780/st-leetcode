package wo1261931780.stleetcode.practice.leetcode.a20230227;

import java.util.Arrays;
import java.util.Random;

/**
 * 需求：把一个数组中的元素复制到另一个新数组中去。
 */
public class aaa055复制数组 {
	public static void main(String[] args) {
		// show();
		System.out.println("**********************");
		cop(show());
		System.out.println("end");
	}
	
	/**
	 * 复制得到的数组
	 *
	 * @param bl 原始数组
	 */
	public static void cop(String[] bl) {
		String[] xx = new String[bl.length];
		System.arraycopy(bl, 0, xx, 0, bl.length);
		System.out.println("复制得到的数组：" + Arrays.toString(xx));
	}
	
	/**
	 * 随机生成的数组
	 *
	 * @return 数组
	 */
	public static String[] show() {
		// String bl = "";
		String[] bl = new String[6];
		Random x = new Random();
		for (int i = 0; i < bl.length; i++) {
			int x1 = x.nextInt(3);
			// Random xx=new Random();
			if (x1 == 0) {
				int x2 = x.nextInt(10) + 48;
				bl[i] = String.valueOf((char) x2);
			} else if (x1 == 1) {
				int x2 = x.nextInt(26) + 65;
				bl[i] = String.valueOf((char) x2);
			} else {
				int x2 = x.nextInt(26) + 97;
				bl[i] = String.valueOf((char) x2);
			}
			System.out.println(bl[i]);
		}
		System.out.println("随机生成的数组：" + Arrays.toString(bl));
		return bl;
	}
}
