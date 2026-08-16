class Solution {
    public int maxProduct(int[] nums) {
          // int  mul=1;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            // int mul=nums[i];
            int por=1;
            for(int j=i;j<nums.length;j++){
               
                // for(int k=i;k<=j;k++){
                      por*=nums[j];
                // }
                  maxsum=Math.max(por,maxsum);
            }
          
        }
        return maxsum;
    }
}