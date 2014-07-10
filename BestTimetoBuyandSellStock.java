/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
*/

public class Solution {
    public int maxProfit(int [] prices) {
        if (prices.length == 0 || prices.length == 1)
            return 0;
        int lowest = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(prices[i] - lowest, max);
            lowest = Math.min(lowest, prices[i]);
        }
        return max;
    }
}
