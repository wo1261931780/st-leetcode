package com.stleetcode.github.io.junw.practice.dekeCode.a20220308;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa004_20220305
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-17-32  星期二
 * @author junw
 */
@Slf4j
public class ccc001 {
	public static void main(String[] args) {
		int[] x = new int[6];
		int[] x1 = {1, 1, 1, 2, 1, 3, 1, 4};
		System.arraycopy(x1, 2, x, 3, 2);
		//----------目标数组，起始位，粘贴到x数组，粘贴索引3，复制长度2
		log.info(Arrays.toString(x));// 注意这里有s，是Arrays
		// x结果：[0, 0, 0, 1, 2, 0]
	}
}
