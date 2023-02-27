package wo1261931780.stleetcode.practice.leetcode.a20230227;

import java.util.Arrays;
import java.util.Random;

/**
 * 需求：在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
 *
 * 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
 */
public class aaa056评委打分 {
	public static void main(String[] args) {
		System.out.println(show());
	}

	public static int show() {
		Random x = new Random();
		int[] x1 = new int[6];
		// int sum = 0;
		// int max = 0;
		// int min = 0;
		int sum = 0, max = 0, min = 0;
		// 上面三个是一样的，不需要分开定义
		for (int i1 = 0; i1 < x1.length; i1++) {
			int i = x.nextInt(100);
			x1[i1] = i;
			sum += x1[i1];

			max = max > x1[i1] ? max : x1[i1];
			min = min < x1[i1] ? min : x1[i1];
		}
		System.out.println(Arrays.toString(x1));
		// for (int i1 = 0; i1 < x1.length; i1++) {
		//     max = max > x1[i1] ? max : x1[i1];
		//     min = min < x1[i1] ? min : x1[i1];
		// }
		int ave = (sum - max - min) / (x1.length - 2);
		return ave;
	}
}
