class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left=1; 
        long mintime=10000007 ;
        for(int x:time){ 
            mintime=Math.min(mintime,x) ;
        } 
        long right=mintime*totalTrips ;
        long ans=right ;
        while(left<=right){ 
            long mid=left+(right-left+1)/2 ; 
            long trips=0 ;
            for(int x:time){
                trips+=mid/x ;
                
            }
            if(trips>=totalTrips){ 
                ans=mid ;
                right=mid-1 ;
            }
            else{ 
                left=mid+1 ;
            }
        }
        return ans ;
    }
}





