class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    public int atmost(int[] nums,int k){ 
        int left=0; 
        int maxsub=0; 
        HashMap<Integer,Integer>empty=new HashMap<>(); 
        for(int right=0;right<nums.length;right++){ 
            int num=nums[right]; 
            empty.put(num,empty.getOrDefault(num,0)+1); 
            while(empty.size()>k){ 
                int leftnum=nums[left]; 
                empty.put(leftnum,empty.get(leftnum)-1); 
                if(empty.get(leftnum)==0){
                    empty.remove(leftnum); 
                }
                left++; 
            }
            maxsub+=right-left+1; 
        }
        return maxsub;
    }
}