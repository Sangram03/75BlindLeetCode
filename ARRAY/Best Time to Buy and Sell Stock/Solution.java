class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0]; // Initialize minimum price
        int profit = 0; // Initialize maximum profit
        
        // Iterate through prices starting from day 2
        for (int i = 1; i < n; i++) {
            // Calculate potential profit if sold on current day
            int cost = prices[i] - min;
            
            // Update maximum profit
            profit = Math.max(cost, profit);
            
            // Update minimum price
            min = Math.min(min, prices[i]);
        }
        
        // Return maximum possible profit
        return profit;
    }
}

/*
 * How it works:

1. Initialize min with the first price and profit to 0.
2. Iterate through prices starting from the second day (i = 1):
    - Calculate potential profit (cost) if sold on the current day.
    - Update profit if cost is higher.
    - Update min if current price is lower.
3. Return the maximum possible profit.

Key Insights:

1. Keep track of the minimum price seen so far (min).
2. Calculate potential profit at each step (cost).
3. Update maximum profit (profit) and minimum price (min) accordingly.

Time Complexity: O(n), where n is the length of the input array.

Space Complexity: O(1), as only a constant amount of space is used.

Example Usage:


int[] prices = {7, 1, 5, 3, 6, 4};
Solution solution = new Solution();
int maxProfit = solution.maxProfit(prices);
System.out.println("Max Profit: " + maxProfit); 
/    Output: Max Profit: 5
 */