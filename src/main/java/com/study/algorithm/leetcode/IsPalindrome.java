package com.study.algorithm.leetcode;

import java.util.Objects;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsPalindrome {

	public static void main(String[] args) {
		log.info("{}", isPalindrome(121));
		log.info("{}", isPalindrome(-121));
		log.info("{}", isPalindrome(10));
		log.info("{}", isPalindrome(1000021));
		log.info("{}", isPalindrome(111));
		log.info("{}", isPalindrome(11));
		log.info("{}", isPalindrome(1234));
		log.info("{}", isPalindrome(12344321));
		log.info("{}", isPalindrome(123454321));
		log.info("{}", isPalindrome(1234521));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		String[] palindromeArray = String.valueOf(x).split("");
		int length = palindromeArray.length;
		for (int i = 0; i < length; i++) {
			if (Objects.equals(palindromeArray[i], palindromeArray[length - i - 1])) {
				continue;
			} else {
				return false;
			}
		}

		return true;
	}
}