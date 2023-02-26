package com.stleetcode.github.io.junw.practice.leetcode.a20230217;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode.github.io
 * Package:com.stleetcode.github.io.junw.practice.leetcode.a20230217
 *
 * @author liujiajun_junw
 * @Date 2023-02-20-13  星期五
 * @description
 */
class A046两数之和最优解 {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; ++i) {
			// map 中若包含 key:target - nums[i], 则 + nums[i] 为答案
			if (map.containsKey(target - nums[i])) {
				return new int[]{map.get(target - nums[i]), i};
			}
			// 注意：map.put 需放在if后，如果放在if前，则需去除map.get与nums[i]下标相同的结果
			map.put(nums[i], i);
		}
		return null;
	}
}
