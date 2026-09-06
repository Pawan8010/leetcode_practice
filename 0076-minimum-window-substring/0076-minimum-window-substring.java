class Solution {
    public String minWindow(String s, String t) {
        int l=0;
        int r=0;
        int minlen=Integer.MAX_VALUE;
        int[] hash=new int[256];
        int startind=0;

        int count=0;
        for(int i=0;i<t.length();i++){
            hash[t.charAt(i)]++;
        }

        while(r<s.length()){
            // to add char
            char cr=s.charAt(r);
            if(hash[cr]>0){
                count++;
            }
            hash[cr]--;

            // if valid
            while(count==t.length()){
             
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    startind=l;
                }
                

                char cl=s.charAt(l);

                hash[cl]++;
                if(hash[cl]>0){
                    count--;
                }
                l++;
            }
            r=r+1;

        //   fir next small window
        }
         if (minlen == Integer.MAX_VALUE) {
            return "";
        }
        
        String str=s.substring(startind,startind+minlen);
        return str;
    }
}