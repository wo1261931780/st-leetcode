package wo1261931780.stleetcode.practice.leetcode.a20230417;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import static wo1261931780.stleetcode.practice.other.FinalVar.FINAL_SPLIT;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230417
 *
 * @author liujiajun_junw
 * @Date 2023-04-13-48  星期一
 * @description
 */
public class A20230417002 {
	/**
	 * 描述
	 * 实现删除字符串中出现次数最少的字符，若出现次数最少的字符有多个，则把出现次数最少的字符都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
	 *
	 * 数据范围：输入的字符串长度满足
	 * 1
	 * ≤
	 * �
	 * ≤
	 * 20
	 *
	 * 1≤n≤20  ，保证输入的字符串中仅出现小写字母
	 * 输入描述：
	 * 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
	 *
	 * 输出描述：
	 * 删除字符串中出现次数最少的字符后的字符串。
	 * @param args
	 */
	public static void main(String[] args) {
		// HashMap<String, Integer> integerHashMap = new HashMap<>();
		// String nextLine = new Scanner(System.in).nextLine();
		// 这里可以直接用toCharArray()方法
		System.out.println(FINAL_SPLIT);
		// for (int i = 0; i < nextLine.length(); i++) {
		// 	char charAt = nextLine.charAt(i);
		// 	String s = charAt + "";
		// 	if (integerHashMap.containsKey(s)) {
		// 		integerHashMap.put(s, integerHashMap.get(s) + 1);
		// 	} else {
		// 		integerHashMap.put(s, 1);
		// 	}
		// }
		// System.out.println(integerHashMap);
		// nextLine.replace(" ", "");
		showMeSample();// 用空字符串替换该字母
	}
	
	static void showMeSample() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String s = scanner.nextLine();
			char[] chars = s.toCharArray();
			// 统计每个字母的数量
			HashMap<Character, Integer> map = new HashMap<>();
			for (char aChar : chars) {
				map.put(aChar, (map.getOrDefault(aChar, 0) + 1));
			}
			// 找到数量最少的字符数量
			Collection<Integer> values = map.values();
			Integer min = Collections.min(values);
			
			// 用空字符串替换该字母
			for (Character character : map.keySet()) {
				if (map.get(character).equals(min)) {
					s = s.replaceAll(String.valueOf(character), "");
				}
			}
			System.out.println(s);
		}
	}
}
