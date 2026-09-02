class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int len=0;
        
        int[] arr=new int[256];

        Arrays.fill(arr,-1);

        int n=s.length();

        int r=0;
        int l=0;
        while(r<n){
            if(arr[s.charAt(r)]!=-1){
                l=Math.max(arr[s.charAt(r)]+1,l);
            }

            len=Math.max(len,r-l+1);
            maxlen=Math.max(maxlen,len);

            arr[s.charAt(r)]=r;
               
            r++;
        }
        return maxlen;

    }
}