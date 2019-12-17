package leetcode;

public class lc122 {
    public static void main(String[] args) {
        int[] prices1 = new int[]{7,1,5,3,6,4};
        int[] prices2 = new int[]{7,6,4,3,1};
        int[] prices3 = new int[]{1,2,3,4,5};
        lc122 solution =  new lc122();
        System.out.println(solution.maxProfit(prices1));
        System.out.println(solution.maxProfit(prices2));
        System.out.println(solution.maxProfit(prices3));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i-1])
                profit += prices[i] - prices[i-1];
        }
     return profit;
    }
}
