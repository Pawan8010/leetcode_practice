class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[nums1.length];
        int left=0;
        int right=0;
        int i=0;
        while( left<m && right<n){
            if(nums1[left]<nums2[right]){
                ans[i]=nums1[left];
                left++;
             }
             else{
                ans[i]=nums2[right];
                right++;
             }
             i++;
        }
          while(right<n){
            // if(nums1[i]<=nums1[right]){
                ans[i]=nums2[right];
                right++;
            //  }
             i++;
           
        }
          while(left<m){
            // if(nums1[i]<=nums1[right]){
                ans[i]=nums1[left];
                left++;
            //  }
             i++;
           
        }
        for(int j=0;j<nums1.length;j++){
            nums1[j]=ans[j];
        }

        
    }
}