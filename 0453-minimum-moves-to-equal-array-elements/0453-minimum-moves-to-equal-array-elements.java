class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        long sum = 0;
        
        // Single pass to find minimum and calculate sum
        for (int num : nums) {
            min = Math.min(min, num);
            sum += num;
        }
        
        // Calculate moves: sum - (min * n)
        // Cast to int as the problem guarantees the answer fits in a 32-bit integer
        return (int) (sum - (long) min * nums.length);
    }
}   