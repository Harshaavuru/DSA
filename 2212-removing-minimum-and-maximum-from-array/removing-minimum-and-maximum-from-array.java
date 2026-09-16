class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length; 
        int minindex=0; 
        int maxindex=0; 
        for(int i=0;i<nums.length;i++){ 
            if(nums[i]<nums[minindex]){ 
                minindex=i; 
            }
            if(nums[i]>nums[maxindex]){ 
                maxindex=i; 
            }
        }
        int front=Math.max(minindex,maxindex)+1; 
        int rear=n-Math.min(minindex,maxindex); 
        int both=Math.min(minindex,maxindex)+1+n-Math.max(minindex,maxindex);
        return Math.min(front,Math.min(rear,both)); 
    }
}