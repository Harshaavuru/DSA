class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n=dist.length ;
       
        int left=1 ; 
        int right=10000000 ;
        int ans=-1 ;
        while(left<=right){ 
            int mid=left+(right-left)/2 ; 
            double time=0; 
            for(int i=0;i<n;i++){ 
                if(i==n-1){ 
                    time+=(double)dist[i]/mid ;
                }
                else{ 
                    time+=Math.ceil((double)dist[i]/mid) ;
                }
            }
            if(time<=hour){ 
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