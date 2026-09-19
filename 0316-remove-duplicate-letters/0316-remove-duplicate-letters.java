class Solution {
    public String removeDuplicateLetters(String s) {
        int left=0;
        int right=0;

        int[] ch=new int[26];
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']=i;
        }
        boolean check[]=new boolean[26];

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int index=c-'a';

            if(check[index]){
                continue;
            }

            while(sb.length()>0 && sb.charAt(sb.length()-1)>c && ch[sb.charAt(sb.length()-1)-'a']>i){

                char remove=sb.charAt(sb.length()-1);
                sb.deleteCharAt(sb.length()-1);

                check[remove-'a']=false;

            }
            sb.append(c);
            check[index]=true;
        }
        return sb.toString();
        
    }
}