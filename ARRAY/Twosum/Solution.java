class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Iterate through the remaining elements
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of current elements equals the target
                if (nums[i] + nums[j] == target) {
                    // Return the indices of the two elements
                    return new int[]{i, j};
                }
            }
        }
        
        // Return empty array if no solution is found
        return new int[]{};
    }
}
