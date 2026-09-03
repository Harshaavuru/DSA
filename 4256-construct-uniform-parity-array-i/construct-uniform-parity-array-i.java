class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean oneven=false; 
        boolean onodd=false; 
        for(int x:nums1){ 
            if(x%2==0){ 
                oneven=true;
            } 
            else{ 
                onodd=false;
            }
        }
        if(!oneven || !onodd){ 
            return true;
        } 
        return true; 
    }
}