class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] nse=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }

            if(!st.isEmpty()){
    
                nse[i]=st.peek()-i;
            }

            st.push(i);
        //     for(int j=i+1;j<n;j++){
        //            if(temperatures[i]<temperatures[j]){
        //             nse[i]=j-i;
        //             break;
        //            }
        //     }
        }
        return nse;
    }
}