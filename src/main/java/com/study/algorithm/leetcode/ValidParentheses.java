package com.study.algorithm.leetcode;

import java.util.Stack;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// Stack
public class ValidParentheses {
	public static void main(String[] args) {
		log.info("{}", isValid("()"));
		log.info("{}", isValid("()[]{}"));
		log.info("{}", isValid("(]"));
	}

	public static boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
}
