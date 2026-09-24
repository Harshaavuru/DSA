class Solution {
    public int search(int[] nums, int target) {
        return solve(nums,target,0,nums.length-1); 
    } 
    int solve(int[] nums,int target,int left,int right){ 
        if(left>right){ 
            return -1 ;
        } 
        int mid=left+(right-left)/2; 
        if(nums[mid]==target){ 
            return mid ; 
        }
        if(target<nums[mid]){
            return solve(nums,target,left,mid-1); 
        } 
        return solve(nums,target,mid+1,right); 
    }
}