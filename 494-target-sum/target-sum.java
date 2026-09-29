class Solution {
    int count=0 ; 
    public int findTargetSumWays(int[] nums, int target) {
        solve(nums,0,0,target); 
        return count; 
    } 
    void solve(int[] nums,int index,int sum,int target){ 
        // base case 
        if(index==nums.length){ 
            if(sum==target){ 
                count++; 
            }
            return ;
        }
        solve(nums,index+1,sum+nums[index],target); 
        solve(nums,index+1,sum-nums[index],target);
    }
}