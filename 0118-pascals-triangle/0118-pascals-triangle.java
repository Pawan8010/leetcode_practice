class Solution {
    // private List<Integer>getpas(int row){
    //     // int col=0;
       
    //     return ans;
    // }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
             List<Integer>ans=new ArrayList<>();
             ans.add(1);
             int res=1;
             for(int col=1;col<i;col++){
            res=res*(i-col);
             res=res/col;
            ans.add(res);
        }
        list.add(ans);
        
        }
        return list;
    }
}