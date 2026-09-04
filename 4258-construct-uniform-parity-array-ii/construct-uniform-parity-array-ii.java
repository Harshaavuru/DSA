class Solution {
    public boolean uniformArray(int[] nums1) {
        int minodd=Integer.MAX_VALUE; 
        for(int x:nums1){ 
            if(x%2!=0){ 
                minodd=Math.min(minodd,x);
            }
        } 
        if (minodd == Integer.MAX_VALUE) {
            return true;
        }
        for(int x:nums1){
            if(x%2==0 && minodd>=x){ 
                return false;
            }
        }
        return true; 
    }
}