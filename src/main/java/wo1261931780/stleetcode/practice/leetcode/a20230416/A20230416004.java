package wo1261931780.stleetcode.practice.leetcode.a20230416;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230416
 *
 * @author liujiajun_junw
 * @Date 2023-04-20-49  星期日
 * @description
 */

public class A20230416004 {
	/**
	 * 描述
	 * 现在有一种密码变换算法。
	 * 九键手机键盘上的数字与字母的对应： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0，把密码中出现的小写字母都变成九键键盘对应的数字，如：a 变成 2，x 变成 9.
	 * 而密码中出现的大写字母则变成小写之后往后移一位，如：X ，先变成小写，再往后移一位，变成了 y ，例外：Z 往后移是 a 。
	 * 数字和其它的符号都不做变换。
	 * 数据范围： 输入的字符串长度满足
	 * 1
	 * ≤
	 * �
	 * ≤
	 * 100
	 * <p>
	 * 1≤n≤100
	 * 输入描述：
	 * 输入一组密码，长度不超过100个字符。
	 * <p>
	 * 输出描述：
	 * 输出密码变换后的字符串
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		StringBuilder demo = new StringBuilder();
		for (int i = 0; i < nextLine.length(); i++) {
			char c = nextLine.charAt(i);
			if (c >= 'a' && c <= 'z') {
				// nextLine = nextLine.replace(c, (char) (c - 'a' + '2'));
				switch (c) {
					case 'a':
					case 'b':
					case 'c':
						demo.append(2);
						break;
					case 'd':
					case 'e':
					case 'f':
						demo.append(3);
						break;
					case 'g':
					case 'h':
					case 'i':
						demo.append(4);
						break;
					case 'j':
					case 'k':
					case 'l':
						demo.append(5);
						break;
					case 'm':
					case 'n':
					case 'o':
						demo.append(6);
						break;
					case 'p':
					case 'q':
					case 'r':
					case 's':
						demo.append(7);
						break;
					case 't':
					case 'u':
					case 'v':
						demo.append(8);
						break;
					case 'w':
					case 'x':
					case 'y':
					case 'z':
						demo.append(9);
						break;
					default:
						demo.append(0);
						break;
				}
				// A20230508001.append((char) (c - 'a' + '2'));
			} else if (c >= 'A' && c <= 'Z') {
				if (c == 'Z') {
					// nextLine = nextLine.replace(c, 'a');
					demo.append('a');
				} else {
					// nextLine = nextLine.replace(c, (char) (c - 'A' + 'a' + 1));
					demo.append((char) (c - 'A' + 'a' + 1));
				}
			} else {
				demo.append(c);
			}
		}
		// System.out.println(nextLine);
		System.out.println(demo);

		sampleCode();
	}


	// 定义map容器存储按键对应数字字符的容器
	// 静态初始化、加载map容器
	private static Map<String, String> demoMap = new HashMap<>();

	static {
		demoMap.put("1", "1");
		demoMap.put("abc", "2");
		demoMap.put("def", "3");
		demoMap.put("ghi", "4");
		demoMap.put("jkl", "5");
		demoMap.put("mno", "6");
		demoMap.put("pqrs", "7");
		demoMap.put("tuv", "8");
		demoMap.put("wxyz", "9");
		demoMap.put("0", "0");
	}

	public static void sampleCode() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			char[] chars = str.toCharArray();
			// 构造buffer容器存储转换后的字符串
			StringBuffer buffer = new StringBuffer();
			for (char c : chars) {
				// 如果是正整数则不需要进行加密
				if (c >= '0' && c <= '9') {
					buffer.append(String.valueOf(c));
				} else if (c >= 'A' && c <= 'Y') { // 如果是A~Y的大写字母则需要将其+32位转换成小写再向后移1位
					char newChar = (char) (c + 32 + 1);
					buffer.append(String.valueOf(newChar));
				} else if (c == 'Z') { // 如果是Z则加密成a
					buffer.append("a");
				} else {
					// 去除map容器中的key与字符进行校验并加密
					Set<String> keys = demoMap.keySet();
					for (String k : keys) {
						if (k.contains(String.valueOf(c))) {
							buffer.append(demoMap.get(k));
						}
					}
				}
			}
			System.out.print(buffer.toString());
		}
	}
}
