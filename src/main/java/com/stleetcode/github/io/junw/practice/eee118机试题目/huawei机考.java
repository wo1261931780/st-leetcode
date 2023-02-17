package com.stleetcode.github.io.junw.practice.eee118机试题目;

import java.util.Scanner;

/**
 * @author junw
 */
public class huawei机考 {
	public static void main(String[] args) {
		// 有一个数组 a[N] 顺序存放 0 ~ N-1 ，
		// 要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，
		// 求最后一个被删掉的数的原始下标位置。
		// 以 8 个数 (N=7) 为例 :
		// ｛ 0，1，2，3，4，5，6，7 ｝，0 -> 1 -> 2 (删除) -> 3 -> 4 -> 5 (删除) -> 6 -> 7 -> 0 (删除),
		// 如此循环直到最后一个数被删除。
		// 1<=n<=1000;
		Scanner x = new Scanner(System.in);
		// int x1 = x.nextInt();

		int[] x2 = new int[x.nextInt()];
		for (int i = 0; i < x.nextInt(); i++) {
			x2[i] = i;
		}

	}

// --注释掉检查 START (2022-09-01 12:35):
//    public static void div(int[] x2) {
//        for (int i = 0; i < x2.length; i++) {
//            if (i % 3 == 0) {
//                if (x2[i] == -1) {
//                    i++;
//                    x2[i] = -1;
//                } else {
//                    x2[i] = -1;
//                }
//            }
//        }
//    }
// --注释掉检查 STOP (2022-09-01 12:35)
}
