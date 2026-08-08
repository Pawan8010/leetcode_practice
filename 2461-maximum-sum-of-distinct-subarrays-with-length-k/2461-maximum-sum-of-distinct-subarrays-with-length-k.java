class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        long res=0;
        long sum=0;
        int l=0;
        int r=0;
        while(r<nums.length){

            while(set.contains(nums[r])){
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }

            sum+=nums[r];
            set.add(nums[r]);

            if(r-l+1==k){
                res=Math.max(res,sum);


                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            r++;
        }
        return res;
    }
}