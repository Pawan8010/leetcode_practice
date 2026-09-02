class Solution {
    public String decodeString(String s) {
        Stack<Integer>num=new Stack<>();
        Stack<String>curr=new Stack<>();
   
        int number=0;
        String cur="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

           if(Character.isDigit(ch)){
            number=number*10+(ch-'0');
           }

           else if(ch=='['){
            num.push(number);
            curr.push(cur);

            number=0;
            cur="";
           }
           else if(ch==']'){
            int count=num.pop();
            String prev=curr.pop();

            cur=prev+cur.repeat(count);
           }
           else{
            cur+=ch;
           }
        }
        return cur;
    }
}