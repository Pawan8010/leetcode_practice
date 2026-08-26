class Solution {
    static void solve(int index, List<List<Integer>>list,List<Integer>ans,int[]arr,int target){
        if(target==0){
            list.add(new ArrayList<>(ans));
            return;
       }
    

       for(int i=index;i<arr.length;i++){
        // include case  
         if(arr[i]>target) continue;
         ans.add(arr[i]);
         solve(i,list,ans,arr,target-arr[i]);

        // exclude case
        ans.remove(ans.size()-1);
        //  solve(index+1,list,ans,arr,target);
       }
    }
   
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    //   taking element multiple time 
    // once elemnt will br excluded not piking it in future
    List<List<Integer>>list=new ArrayList<>();
    List<Integer>ans=new ArrayList<>();
    solve(0,list,ans,candidates,target);
    return list;

    }
}