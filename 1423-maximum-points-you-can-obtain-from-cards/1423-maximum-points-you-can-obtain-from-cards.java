class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int leftsum=0;
        int rightsum=0;
        int maxsum=0;
        int right=n-1;
        for(int i=0;i<k;i++){
            leftsum+=cardPoints[i];
        }
        maxsum=leftsum;
        for(int i=k-1;i>=0;i--){
            leftsum-=cardPoints[i];
            rightsum+=cardPoints[right];
            maxsum=Math.max(maxsum,leftsum+rightsum);
            right--;
        }
        return maxsum;
    }
}