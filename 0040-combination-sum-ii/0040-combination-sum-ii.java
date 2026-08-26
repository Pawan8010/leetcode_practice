class Solution {
     static void solve(int index, List<List<Integer>>list,List<Integer>ans,int[]arr,int target){
        if(target==0){
            list.add(new ArrayList<>(ans));
            return;
       }
    

    if(target<0) return;
    if(index>=arr.length) return;

         ans.add(arr[index]);
         solve(index+1,list,ans,arr,target-arr[index]);

        // exclude case
        ans.remove(ans.size()-1);
        while(index+1<arr.length && arr[index]==arr[index+1]){
            index++;
         }
        solve(index+1,list,ans,arr,target);
       }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
     Arrays.sort(candidates);
     List<List<Integer>>list=new ArrayList<>();
    List<Integer>ans=new ArrayList<>();
    solve(0,list,ans,candidates,target);
    return list;
    }
}