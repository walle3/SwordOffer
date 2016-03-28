package com.nowcoder.offer.problem32;

public class NumberOf1Between1AndN {
	/**
	 * O(nlgn)
	 * @param n
	 * @return
	 */
	public int getNumberOf1Between1AndN(int n) {
		if (n < 1) {
			return 0;
		}
		
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int val = i;
			while (val != 0) {
				if (val % 10 == 1) {
					count++;
				}
				val = val / 10;
			}
		}
		
		return count;
	}
	
	public int countDigitOne(int n) {
		int count = 0;
		for (int i = 1; i <= n; i *= 10) {
			count += (n / i + 8) / 10 * i + ((n / i % 10 == 1) ? (n % i + 1) : 0);
		}
		
		return count;
	}
}