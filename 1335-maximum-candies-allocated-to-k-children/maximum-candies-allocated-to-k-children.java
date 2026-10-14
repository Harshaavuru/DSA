class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max=0; 
        int left=0;
        int ans=0; 
        for(int pile:candies){ 
            max=Math.max(max,pile);
        }
        int right=max;
        while(left<=right){ 
            int mid=left+(right-left)/2; 
            if(mid==0){ 
                left=1;
                continue;
            }
            long childrens=0; 
            for(int pile:candies){ 
                childrens+=pile/mid;
            }
            if(childrens>=k){  
                ans=mid ;
                left=mid+1 ;
            }
            else{ 
                right=mid-1 ;
            }
        }
        return ans;
    }
}