package com.study.algorithm.leetcode;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RotateArray {
	public static void main(String[] args) {
		log.info(Arrays.toString(rotate(new int[] {1, 2, 3, 4, 5, 6, 7}, 3)));
		log.info(Arrays.toString(rotate(new int[] {-1, -100, 3, 99}, 2)));
	}

	private static int[] rotate(int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);

		return nums;
	}

	private static int[] reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		return nums;
	}
}
