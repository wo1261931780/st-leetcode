package wo1261931780.stleetcode.practice.leetcode.a20230217;

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

	/*
	给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

示例 1：

输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
示例 2：

输入：nums = [3,2,4], target = 6
输出：[1,2]
示例 3：

输入：nums = [3,3], target = 6
输出：[0,1]
	 */
	
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
