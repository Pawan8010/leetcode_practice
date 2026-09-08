class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int maxlen=Integer.MAX_VALUE;
        int sum=0;

        while(right<nums.length){
            sum+=nums[right];

            while(sum>=target){
                maxlen=Math.min(maxlen,right-left+1);
                sum-=nums[left];
                left++;
            }

            right++;
        }
        return maxlen==Integer.MAX_VALUE ? 0 : maxlen;
    }
}