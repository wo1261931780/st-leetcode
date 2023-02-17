package com.stleetcode.github.io.junw.practice.leetcode.a20230217;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode.github.io
 * Package:com.stleetcode.github.io.junw.practice.leetcode.a20230217
 *
 * @author liujiajun_junw
 * @Date 2023-02-19-47  星期五
 * @description
 */
public class A046两数之和 {
	public static void main(String[] args) {
		A046两数之和 solution = new A046两数之和();
		int[] demo1 = {3, 2, 4};
		int target = 6;
		System.out.println(solution.twoSum(demo1, target));
	}


	public int[] twoSum(int[] nums, int target) {
		// 我的思路是先用target减去nums的第一个元素，然后对剩下的元素完成遍历，选择相等的直接返回下标
		int tempNum = 0;
		int tempNum2;
		int remainNum;
		int[] demo = new int[2];
		OUT:
		while (true) {
			for (int i = tempNum + 1; i < nums.length; i++) {
				remainNum = target - nums[tempNum];
				if (nums[i] == remainNum) {
					tempNum2 = i;
					break OUT;
				}
			}
			tempNum++;
		}
		demo[0] = tempNum;
		demo[1] = tempNum2;
		return demo;
	}
}
