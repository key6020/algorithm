package com.study.algorithm.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArrangeCoins {
	public static void main(String[] args) {
		log.info("{}", arrangeCoins(1));
		log.info("{}", arrangeCoins(2));
		log.info("{}", arrangeCoins(3));
		log.info("{}", arrangeCoins(4));
		log.info("{}", arrangeCoins(5));
		log.info("{}", arrangeCoins(6));
		log.info("{}", arrangeCoins(7));
		log.info("{}", arrangeCoins(8));
		log.info("{}", arrangeCoins(9));
		log.info("{}", arrangeCoins(10));
	}

	public static int arrangeCoins(int n) {
		//        if (n == 1) {
		//            return 1;
		//        }
		//        if (n <= 3) {
		//            return 2;
		//        }
		int result = 0;
		for (int i = 1; i <= n; i++) {
			n = n - i;
			result += 1;
		}

		return result;
	}
}