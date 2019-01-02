/*
 
Input: prices = [1, 3, 2, 8, 4, 9], fee = 2
Output: 8
Explanation: The maximum profit can be achieved by:
Buying at prices[0] = 1
Selling at prices[3] = 8
Buying at prices[4] = 4
Selling at prices[5] = 9
The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
 */

package com.test.java.program;

public class BuyAndSellTradeTest {

	public static void main(String[] args) {
		int[] prices = {1, 3, 2, 8, 4, 9};
		int fee = 2;
		int profit = maxProfit(prices, fee);
		System.out.println(profit);
	}
	
	private static int maxProfit(int[] prices, int fee) {
        int cash = 0, hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, cash - prices[i]);
        }
        return cash;
    }

}
