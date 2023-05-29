package com.study.algorithm.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsValidPalindrome {
	public static void main(String[] args) {
		log.info("{}", isValidPalindrome("A man, a plan, a canal: Panama"));
		log.info("{}", isValidPalindrome("race a car"));
		log.info("{}", isValidPalindrome(""));
		log.info("{}", isValidPalindrome(" "));
		log.info("{}", isValidPalindrome("0P"));
	}

	private static boolean isValidPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		if (s.isBlank() || s.length() == 1) {
			return true;
		}
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
