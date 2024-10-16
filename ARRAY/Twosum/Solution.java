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

/*
 * How it works:

1. Initialize n as the length of the input array nums.
2. Use two nested loops to iterate through the array:
    - Outer loop (i): Iterate from the first element to the second-to-last element (n-1).
    - Inner loop (j): Iterate from the next element after i to the last element (n).
3. For each pair of elements (nums[i] and nums[j]), check if their sum equals the target.
4. If a matching pair is found, return an array containing their indices (i and j).
5. If no solution is found after iterating through all pairs, return an empty array.

Time Complexity: O(n^2), where n is the length of the input array.

Space Complexity: O(1), as only a constant amount of space is used.

Example Usage:


int[] nums = {2, 7, 11, 15};
int target = 9;

Solution solution = new Solution();
int[] result = solution.twoSum(nums, target);

System.out.println("Indices: " + result[0] + ", " + result[1]);
/  Output: Indices: 0, 1


 */
