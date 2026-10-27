class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //take the max 1 count if apear zero then 0 to top that else count char 
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else if(nums[i]==0){
                count=0;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}