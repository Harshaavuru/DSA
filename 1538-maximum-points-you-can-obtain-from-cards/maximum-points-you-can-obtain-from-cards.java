class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int total=0;
        for(int x:cardPoints){ 
            total+=x;
        } 
        int size=n-k; 
        int sum=0; 
        for(int i=0;i<size;i++){ 
            sum+=cardPoints[i];  
        } 
        int minsum=sum; 
        for(int i=size;i<n;i++){ 
            sum+=cardPoints[i]; 
            sum-=cardPoints[i-size]; 
            minsum=Math.min(minsum,sum) ; 
        } 
        return total-minsum; 
    }
}