package wo1261931780.stleetcode.practice.leetcode.a20230418;

import org.apache.commons.lang3.time.DateParser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230418
 *
 * @author liujiajun_junw
 * @Date 2023-04-15-28  星期二
 * @description
 */
public class A20230418003 {
	/**
	 * 描述
	 * 根据输入的日期，计算是这一年的第几天。
	 * 保证年份为4位数且日期合法。
	 * 进阶：时间复杂度：
	 * �
	 * (
	 * �
	 * )
	 * <p>
	 * O(n) ，空间复杂度：
	 * �
	 * (
	 * 1
	 * )
	 * <p>
	 * O(1)
	 * 输入描述：
	 * 输入一行，每行空格分割，分别是年，月，日
	 * <p>
	 * 输出描述：
	 * 输出是这一年的第几天
	 *
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MM dd");
		Date parse = simpleDateFormat.parse(nextLine);
		Date parse1 = simpleDateFormat.parse(nextLine.substring(0, 4) + " 01 01");
		long time = parse.getTime() - parse1.getTime();
		time /= 1000 * 60 * 60 * 24;
		System.out.println(time + 1);
		sampleCode();
		sampleCode2();
	}
	
	private static void sampleCode() {
		// 作弊方法，解析固定的格式
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		int m = in.nextInt();
		int d = in.nextInt();
		Calendar c1 = Calendar.getInstance();// 实例化
		c1.set(y, m - 1, d);// 注意月份从0开始
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
	}
	
	/**
	 * copilot 给出的代码
	 */
	public static void sampleCode2(){
		Scanner in = new Scanner(System.in);
		String[] s = in.nextLine().split(" ");
		int year = Integer.parseInt(s[0]);
		int month = Integer.parseInt(s[1]);
		int day = Integer.parseInt(s[2]);
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			days[1] = 29;
		}
		int sum = 0;
		for (int i = 0; i < month - 1; i++) {
			sum += days[i];
		}
		sum += day;
		System.out.println(sum);
	}
}
