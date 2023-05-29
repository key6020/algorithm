package com.study.algorithm.leetcode;

import java.util.HashMap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// HashMap
public class WordPattern {
	public static void main(String[] args) {
		log.info("{}", wordPattern("abba", "dog cat cat dog"));
		log.info("{}", wordPattern("abba", "dog cat cat fish"));
		log.info("{}", wordPattern("aaaa", "dog cat cat dog"));
	}

	private static boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
		if (words.length != pattern.length()) {
			return false;
		}
		HashMap<Character, String> map = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			char key = pattern.charAt(i);
			if (map.containsKey(key)) {
				if (!map.get(key).equals(words[i])) {
					return false;
				}
			} else {
				if (map.containsValue(words[i])) {
					return false;
				}
				map.put(key, words[i]);
			}
		}
		return true;
	}
}
