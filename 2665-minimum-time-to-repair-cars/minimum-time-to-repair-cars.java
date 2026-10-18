class Solution {
    public long repairCars(int[] ranks, int cars) {
        int minrank=ranks[0]; 
        for(int rank:ranks){ 
            minrank=Math.min(minrank,rank) ;
        }
        long left=1 ;
        long right=1L*minrank*cars*cars ;
        while(left<right){ 
            long mid=left+(right-left)/2 ;
            long repair=0; 
            for(int rank:ranks){ 
                repair+=(long) Math.sqrt(mid/rank);
            }
            if(repair>=cars){ 
                right=mid;
            }
            else{ 
                left=mid+1;
            }
        }
        return left ;
    }
}