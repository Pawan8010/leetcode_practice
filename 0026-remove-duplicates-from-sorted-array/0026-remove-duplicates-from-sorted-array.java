class Solution {
    public int removeDuplicates(int[] nums) {
        int dub=0;
        for(int i=1;i<nums.length;i++){
            if(nums[dub]!=nums[i]){
                dub++;
                nums[dub]=nums[i];
            }
        }
        return dub+1;
    }
}