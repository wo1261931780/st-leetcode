package com.stleetcode.github.io.junw.practice.deke.a20220309;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa005_20220309
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-38  星期三
 * @author junw
 */
@Slf4j
public class ccc001 {
	public static void main(String[] args) {
		int[] x = {452, 3, 54, 98, 7, 987, 9, 7, 79, 78, 7, 894, 62, 132, 1};

		// show1(x);// 直接使用arrays排序
		// show2(x);// 利用了插入排序的思想
		// show3(x);// 利用了set集合的思想,但是set集合没有重复元素
		show4(x);// 利用了插入排序的思想


	}

	public static void show4(int[] x) {
		// int x1 = x.length / 2;
		int mid;
		for (int i = 0 ; i < x.length - 1; i++) {
			for (int j = i; j < x.length - i - 1; j++) {
				if (x[j] > x[j + 1]) {
					mid = x[j];
					x[j] = x[j + 1];
					x[j + 1] = mid;
				}
			}
		}
		log.info(Arrays.toString(x));
	}

	// --注释掉检查 START (2022-09-01 12:35):
//    public static void show1(int[] x) {
//        Arrays.sort(x);
// --注释掉检查 START (2022-09-01 12:35):
////        log.info(Arrays.toString(x));
////    }
//// --注释掉检查 STOP (2022-09-01 12:35)
//
//    public static void show2(int[] x) {
//        for (int i = 0; i < x.length; i++) {
//            for (int j = i + 1; j < x.length; j++) {
//                if (x[i] > x[j]) {
//                    int temp = x[i];
// --注释掉检查 START (2022-09-01 12:35):
////                    x[i] = x[j];
////                    x[j] = temp;
////                }
//// --注释掉检查 STOP (2022-09-01 12:35)
//            }
//        }
//        log.info(Arrays.toString(x));
//    }

// --注释掉检查 START (2023/2/17 13:15):
//	public static void show3(int[] x) {
//// --注释掉检查 STOP (2022-09-01 12:35)
//		Set<Integer> demo1 = new LinkedHashSet<>();
//		for (int j : x) {
//			demo1.add(j);
//		}
//		log.info(demo1);
//	}
// --注释掉检查 STOP (2023/2/17 13:15)

}
