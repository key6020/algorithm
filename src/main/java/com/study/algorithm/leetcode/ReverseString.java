package com.study.algorithm.leetcode;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReverseString {
	public static void main(String[] args) {
		log.info(Arrays.toString(reverseString(new char[] {'h', 'e', 'l', 'l', 'o'})));
		log.info(Arrays.toString(reverseString(new char[] {'H', 'a', 'n', 'n', 'a', 'h'})));
	}

	private static char[] reverseString(char[] s) {
		int start = 0;
		int end = s.length - 1;
		while (start < end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
		return s;
	}
}
