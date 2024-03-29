package wo1261931780.stleetcode.practice.deke.a20220409;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa009_20220409
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-15-47  星期六
 * 明明生成了NN个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
 * 数据范围： 1 \le n \le 1000 \1≤n≤1000  ，输入的数字大小满足 1 \le val \le 500 \1≤val≤500
 *
 * @author junw
 */
@Slf4j
public class A025测试 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		while (x.hasNext()) {
			int demoIndex = x.nextInt();
			for (int i = 0; i < demoIndex; i++) {
				log.info(String.valueOf(i));
			}
		}
		// 其实这里有个问题，如果我输出两组数据，n1和n2，那么我的测试结果，到底是n1和n2合并到一组输出，还是分开输出两组？
	}
	
	public static void show() {
		Scanner x1 = new Scanner(System.in);
		int showNum = x1.nextInt();
		Set x2 = new TreeSet();
		for (int i = 0; i < showNum; i++) {
			int demoNum = x1.nextInt();
			if (demoNum >= 1 && demoNum <= 500) {
				log.info(String.valueOf(demoNum));
				x2.add(demoNum);
			}
		}
		x2.stream().forEach(System.out::println);
	}
}
