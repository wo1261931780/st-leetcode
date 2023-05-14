package wo1261931780.stleetcode.practice.deke.a20220304;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa003_20220304
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-22-15  ÐÇÆÚÎå
 *
 * @author junw
 */

@Slf4j
public class A014冒泡排序 {
	public static void main(String[] args) {
		log.info(Arrays.toString(show1()));
	}
	
	public static int[] show1() {
		int mid;
		int[] x = {87, 132, 4, 68, 748, 9, 789, 79, 8, 7};
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i; j < x.length - 1 - i; j++) {
				if (x[j] > x[j + 1]) {
					mid = x[j];
					x[j] = x[j + 1];
					x[j + 1] = mid;
				}
			}
		}
		return x;
	}
}
