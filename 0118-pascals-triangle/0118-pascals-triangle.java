class Solution {
    private List<Integer>getpas(int row){
        // int col=0;
        List<Integer>ans=new ArrayList<>();
        ans.add(1);
        int res=1;
        for(int col=1;col<row;col++){
            res=res*(row-col);
            res=res/col;
            ans.add(res);
        }
        return ans;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
           list.add(getpas(i));
        }
        return list;
    }
}