package com.study.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// Set
public class HappyNumber {
	public static void main(String[] args) {
		log.info("{}", isHappy(19));
		log.info("{}", isHappy(2));
	}

	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();

		while (!set.contains(n)) {
			set.add(n);

			int temp = n;
			n = 0;

			while (temp != 0) {
				n += (temp % 10) * (temp % 10);
				temp /= 10;
			}

			if (n == 1)
				return true;
		}
		return false;
	}

	// chatGPT
	// public boolean isHappy(int n) {
	// 	Set<Integer> set = new HashSet<>();
	//
	// 	while (n != 1) {
	// 		if (set.contains(n)) {
	// 			return false; // Cycle detected, not a happy number
	// 		}
	//
	// 		set.add(n); // Add current number to the set
	// 		n = digitSquareSum(n); // Calculate the sum of the squares of digits
	// 	}
	//
	// 	return true; // Number is a happy number
	// }
	//
	// private int digitSquareSum(int n) {
	// 	int sum = 0;
	//
	// 	while (n > 0) {
	// 		int digit = n % 10;
	// 		sum += digit * digit;
	// 		n /= 10;
	// 	}
	//
	// 	return sum;
	// }
}
