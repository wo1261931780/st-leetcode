package wo1261931780.stleetcode.practice.leetcode.a20230418;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230418
 *
 * @author liujiajun_junw
 * @Date 2023-04-16-00  星期二
 * @description
 */
public class A20230418005 {
	/**
	 * 描述
	 * 判断短字符串S中的所有字符是否在长字符串T中全部出现。
	 * 请注意本题有多组样例输入。
	 * 数据范围:
	 * 1
	 * ≤
	 * �
	 * �
	 * �
	 * (
	 * �
	 * )
	 * ,
	 * �
	 * �
	 * �
	 * (
	 * �
	 * )
	 * ≤
	 * 200
	 * <p>
	 * 1≤len(S),len(T)≤200
	 * 进阶：时间复杂度：
	 * �
	 * (
	 * �
	 * )
	 * <p>
	 * O(n) ，空间复杂度：
	 * �
	 * (
	 * �
	 * )
	 * <p>
	 * O(n)
	 * 输入描述：
	 * 输入两个字符串。第一个为短字符串，第二个为长字符串。两个字符串均由小写字母组成。
	 * <p>
	 * 输出描述：
	 * 如果短字符串的所有字符均在长字符串中出现过，则输出字符串"true"。否则输出字符串"false"。
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		// okekwgktczxeposiirjmquypjbohexyinlktaunjyhkjw
		String nextLine1 = scanner.nextLine();
		// yjynxoawaobtbpyxhbqpzdqjehydzfistxtlzrqzdotglpcunfmpvaparnxkmsybwo
		Set<String> treeSet = new HashSet<>();
		for (int i = 0; i < nextLine.length(); i++) {
			char c = nextLine.charAt(i);
			treeSet.add(String.valueOf(c));
		}
		Boolean flag = false;
		for (String character : treeSet) {
			if (nextLine1.contains(character)) {
				flag = true;
				break;
			}
		}
		System.out.println(flag);
		// 不是很理解题目的意思
		sampleCode();
	}
	
	private static void sampleCode() {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String pShortString = in.nextLine();
			String pLongString = in.nextLine();
			boolean res = isAllCharExist(pShortString, pLongString);
			System.out.println(res);
		}
	}
	
	public static boolean isAllCharExist(String pShortString, String pLongString) {
		Set<Character> set = new HashSet<>();
		for (char ch : pLongString.toCharArray()) {
			set.add(ch);
		}
		for (char ch : pShortString.toCharArray()) {
			if (!set.contains(ch)) {
				return false;
			}
		}
		return true;
	}
}
