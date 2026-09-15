class Solution {
    static void solve(int index,String digits,String[] ch,String currunt,List<String>list){
        if(index==digits.length()){
            list.add(currunt);
            return;
        }
        String letter=ch[digits.charAt(index)-'0'];
       for(char s : letter.toCharArray()){
            solve(index+1,digits,ch,currunt+s,list);
        }

    }
    public List<String> letterCombinations(String digits) {
        List<String>list=new ArrayList<>();
        if(digits.length()==0){
            return list;
        }
        String ch[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        solve(0,digits,ch,"",list);
        return list;
        
    }
}