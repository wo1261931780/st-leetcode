package wo1261931780.stleetcode.practice.leetcode.a20230417;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230417
 *
 * @author liujiajun_junw
 * @Date 2023-04-15-15  星期一
 * @description
 */
public class A20230417003 {
	/**
	 * 描述
	 * 对字符串中的所有单词进行倒排。
	 * <p>
	 * 说明：
	 * <p>
	 * 1、构成单词的字符只有26个大写或小写英文字母；
	 * <p>
	 * 2、非构成单词的字符均视为单词间隔符；
	 * <p>
	 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
	 * <p>
	 * 4、每个单词最长20个字母；
	 * <p>
	 * 数据范围：字符串长度满足
	 * 1
	 * ≤
	 * �
	 * ≤
	 * 10000
	 * <p>
	 * 1≤n≤10000
	 * 输入描述：
	 * 输入一行，表示用来倒排的句子
	 * <p>
	 * 输出描述：
	 * 输出句子的倒排结果
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		nextLine = nextLine.replaceAll("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", " ");
		String[] split = nextLine.split(" ");// 以空格分割
		for (int i = split.length - 1; i >= 0; i--) {
			
			if (i == 0) {
				System.out.print(split[i]);
			} else {
				System.out.print(split[i] + " ");
			}
		}
		sampleCode();
	}
	
	static void sampleCode() {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String str = in.nextLine();
			
			// 匹配非字母的字符进行分割
			String[] words = str.split("[^A-Za-z]");
			StringBuilder result = new StringBuilder();
			
			// 逆序添加分割完的单词
			for (int i = words.length - 1; i >= 0; i--) {
				result.append(words[i]).append(" ");
			}
			
			System.out.println(result);
		}
	}
}
