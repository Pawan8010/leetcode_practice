class Solution {
    static void solve(int[] candidates,int target,int index,List<Integer>list,  List<List<Integer>>finallist){
        if(target==0){
              finallist.add(new ArrayList<>(list));
            return;
        }
        if(target<0 || index>=candidates.length){
          return;
         }
        

        list.add(candidates[index]);
         solve(candidates,target-candidates[index],index,list,finallist);
        list.remove(list.size()-1);
         solve(candidates,target,index+1,list,finallist);
       
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>finallist=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
         solve(candidates,target,0,list,finallist);
        //   finallist.add(list);
          return finallist;
    }
}