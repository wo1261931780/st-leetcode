package wo1261931780.stleetcode.practice.leetcode.a20230420;

import java.util.Scanner;

import static wo1261931780.stleetcode.practice.other.FinalVar.FINAL_SPLIT;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230420
 *
 * @author liujiajun_junw
 * @Date 2023-04-17-42  星期四
 * @description
 */
public class A20230420003 {
	public static int FinalScore = 0;
	
	public static void main(String[] args) {
		int pawNum = 0;// 密码数字个数
		int pawChar1 = 0;// 密码字母个数
		int pawChar2 = 0;// 密码字母个数
		int pawOther = 0;// 密码其他字符个数
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		lengthScore(nextLine);// 密码长度得分
		
		for (int i = 0; i < nextLine.length(); i++) {
			char c = nextLine.charAt(i);
			if (c >= '0' && c <= '9') {
				pawNum++;
			} else if ((c >= 'a' && c <= 'z')) {
				pawChar1++;
			} else if ((c >= 'A' && c <= 'Z')) {
				pawChar2++;
			} else {
				pawOther++;
			}
		}
		wordScore(pawChar1, pawChar2);
		
		mathNumScore(pawNum);
		
		// 其他字符得分
		if (pawOther != 0) {
			FinalScore += pawOther == 1 ? 10 : 25;
		}
		if (pawChar1 != 0 && pawChar2 != 0 && pawNum != 0 && pawOther != 0) {
			FinalScore += 5;
		} else if (pawChar1 + pawChar2 != 0 && pawNum != 0 && pawOther != 0) {
			FinalScore += 3;
		} else if (pawChar1 + pawChar2 != 0 && pawNum != 0) {
			FinalScore += 2;
		}
		showScore(FinalScore);
		
		System.out.println(FINAL_SPLIT);
		sampleCode();
	}
	
	private static void sampleCode() {
		/*
		   score 分数
		   upCount 大写字母数目
		   lowCount 小写字母数目
		   numCount 数字数目
		   sigCount 符号数目
		 */
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextLine()) {
			char[] ch = in.nextLine().toCharArray();
			int score = 0;
			
			// 统计长度
			int len = ch.length;
			if (len <= 4) {
				score += 5;
			} else if (len > 4 && len < 8) {
				score += 10;
			} else {
				score += 25;
			}
			
			// 遍历获取大小写字母、数字、符号数目
			int upCount = 0;
			int lowCount = 0;
			int numCount = 0;
			int sigCount = 0;
			
			for (int i = 0; i < len; i++) {
				if (Character.isUpperCase(ch[i])) {
					++upCount;
				} else if (Character.isLowerCase(ch[i])) {
					++lowCount;
				} else if (Character.isDigit(ch[i])) {
					++numCount;
				} else {
					++sigCount;
				}
			}
			
			// 字母分数
			if ((upCount > 0 && lowCount == 0) || (upCount == 0 && lowCount > 0)) {
				score += 10;
			} else if (upCount > 0 && lowCount > 0) {
				score += 20;
			} else {
				score += 0;
			}
			
			// 数字分数
			if (numCount == 1) {
				score += 10;
			} else if (numCount > 1) {
				score += 20;
			} else {
				score += 0;
			}
			
			// 符号分数
			if (sigCount == 1) {
				score += 10;
			} else if (sigCount > 1) {
				score += 25;
			} else {
				score += 0;
			}
			
			// 奖励分数
			if (numCount > 0 && upCount > 0 && lowCount > 0 && sigCount > 0) {
				score += 5;
			} else if (numCount > 0 && sigCount > 0 && (upCount > 0 || lowCount > 0)) {
				score += 3;
			} else if (numCount > 0 && (upCount > 0 || lowCount > 0)) {
				score += 2;
			}
			
			// 评分
			if (score >= 90) {
				System.out.println("VERY_SECURE");
			} else if (score >= 80) {
				System.out.println("SECURE");
			} else if (score >= 70) {
				System.out.println("VERY_STRONG");
			} else if (score >= 60) {
				System.out.println("STRONG");
			} else if (score >= 50) {
				System.out.println("AVERAGE");
			} else if (score >= 25) {
				System.out.println("WEAK");
			} else {
				System.out.println("VERY_WEAK");
			}
		}
	}
	
	private static void wordScore(int pawChar1, int pawChar2) {
		// 大小写字母奖励
		
		if (pawChar1 == 0 || pawChar2 == 0) {
			FinalScore += pawChar1 + pawChar2 == 0 ? 0 : 10;
		} else {
			FinalScore += 20;
		}
	}
	
	private static void mathNumScore(int pawNum) {
		// 数字数量得分
		if (pawNum == 1 || pawNum == 0) {
			FinalScore += pawNum == 1 ? 10 : 0;
		} else {
			FinalScore += 20;
		}
	}
	
	private static void lengthScore(String nextLine) {
		int pawLength;
		// 密码长度得分
		if (nextLine.length() <= 4) {
			pawLength = 5;
		} else if (nextLine.length() <= 7) {
			pawLength = 10;
		} else {
			pawLength = 25;
		}
		FinalScore += pawLength;
	}
	
	public static void showScore(int FinalScore) {
		if (FinalScore >= 90) {
			System.out.println("VERY_SECURE");
		} else if (80 <= FinalScore) {
			System.out.println("SECURE");
		} else if (70 <= FinalScore) {
			System.out.println("VERY_STRONG");
		} else if (60 <= FinalScore) {
			System.out.println("STRONG");
		} else if (50 <= FinalScore) {
			System.out.println("AVERAGE");
		} else if (25 <= FinalScore) {
			System.out.println("WEAK");
		} else {
			System.out.println("VERY_WEAK");
		}
	}
}
