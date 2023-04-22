package com.study.algorithm.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaxProfit {
	public static void main(String[] args) {
		log.info("{}", maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
		log.info("{}", maxProfit(new int[] {1, 2, 3, 4, 5}));
		log.info("{}", maxProfit(new int[] {7, 6, 4, 3, 1}));

	}

	// greedy approach
	// 가격에 관계 없이 항상 물건을 사서 다음 날이 비싸면 판다 라는 관점
	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			int diff = prices[i] - prices[i - 1];
			if (diff > 0) {
				maxProfit += diff;
			}
		}

		return maxProfit;
	}
}
