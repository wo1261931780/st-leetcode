package wo1261931780.stleetcode.practice.leetcode.a20230228;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230227.a20230228
 *
 * @author liujiajun_junw
 * @Date 2023-02-17-05  星期二
 * @description
 */
public class aaa068统计字符大小写 {
	/**
	 * 需求：
	 * 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
	 * 思路：
	 * 1:键盘录入一个字符串，用 Scanner 实现
	 * 2:要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
	 * 3:遍历字符串，得到每一个字符
	 * 4:判断该字符属于哪种类型，然后对应类型的统计变量+1
	 * 假如ch是一个字符，我要判断它属于大写字母，小写字母，还是数字，直接判断该字符是否在对应的范围即可
	 * 大写字母：ch>='A' && ch<='Z'
	 * 小写字母： ch>='a' && ch<='z'
	 * 数字： ch>='0' && ch<='9'
	 * 5:输出三种类型的字符个数
	 */
	public static void bl2() {
		System.out.println("遍历，识别大小写");
		Scanner x3 = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String x4 = x3.nextLine();
		for (int i = 0; i < x4.length(); i++) {
			if (x4.charAt(i) > 64 && x4.charAt(i) < 97) {
				System.out.println("大写字符：" + x4.charAt(i));
			} else if (x4.charAt(i) > 96 && x4.charAt(i) < 123) {
				System.out.println("小写字符：" + x4.charAt(i));
			} else if (x4.charAt(i) > 47 && x4.charAt(i) < 65) {
				System.out.println("数字：" + x4.charAt(i));
			} else {
				System.out.println("错误代码");
			}
		}
	}
}
