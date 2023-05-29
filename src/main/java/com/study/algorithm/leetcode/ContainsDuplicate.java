package com.study.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// Set
public class ContainsDuplicate {
	public static void main(String[] args) {
		log.info("{}", containsDuplicate(new int[] {1, 2, 3, 1}));
		log.info("{}", containsDuplicate(new int[] {1, 2, 3, 4}));
		log.info("{}", containsDuplicate(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
	}

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (set.contains(num)) {
				return true;
			}
			set.add(num);
		}
		return false;
	}
}
