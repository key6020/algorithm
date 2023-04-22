package com.study.algorithm.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoveDuplicates {
	public static void main(String[] args) {
		log.info("{}", removeDuplicates(new int[] {1, 1, 2}));
		log.info("{}", removeDuplicates(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int answer = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[answer] = nums[i];
				answer++;
			}
		}
		return answer;
	}
}
