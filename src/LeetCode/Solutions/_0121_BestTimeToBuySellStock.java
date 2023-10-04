package LeetCode.Solutions;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class _0121_BestTimeToBuySellStock {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 7, 5, 6, 11};
        System.out.println(maxProfit(nums));
    }

    /****************** Brute Force  ******************************/
    public static int maxProfitBruteForce(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
                }

            }

        }
        return maxProfit;
    }

    /****************** Optimal ******************************/
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }


}


