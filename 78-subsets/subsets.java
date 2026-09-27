class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>>empty=new ArrayList<>(); 
        int n=nums.length; 
        for(int mask=0;mask<(1<<n);mask++){ 
            ArrayList<Integer>list=new ArrayList<>(); 
            for(int i=0;i<n;i++){ 
                if((mask & (1<<i))!=0){ 
                    list.add(nums[i]) ; 
                }
            }
            empty.add(list) ; 
        }
        return empty ;
    }
}