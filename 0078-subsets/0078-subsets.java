class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int i=0;
        return solve(list,i,ans,nums);
        
    }
    public List<List<Integer>> solve(List<Integer> list,int index,List<List<Integer>> ans,int[]nums){

        if(index==nums.length)
        {
            ans.add(new ArrayList<>(list));
            return ans;
        }
        list.add(nums[index]);

        solve(list,index+1,ans,nums);

        list.remove(list.size()-1);

        solve(list,index+1,ans,nums);
        
        return ans;
    }
}