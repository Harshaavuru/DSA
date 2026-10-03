class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>>result=new ArrayList<>() ; 
        solve(nums,0,new ArrayList<>(),result) ; 
        return result ;
    } 
    void solve(int[] nums,int index,List<Integer>empty,List<List<Integer>>result){ 
            result.add(new ArrayList<>(empty)) ; 
            for(int i=index;i<nums.length;i++){ 
                if(i>index && nums[i]==nums[i-1]){ 
                    continue;
            }
                empty.add(nums[i]); 
                solve(nums,i+1,empty,result); 
                empty.remove(empty.size()-1); 
        }
    }
}