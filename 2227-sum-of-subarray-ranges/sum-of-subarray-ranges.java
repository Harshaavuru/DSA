class Solution {
    public long subArrayRanges(int[] nums) {
        long maxsum=0; 
        long minsum=0; 
        int n=nums.length; 
        Stack<Integer>empty=new Stack<>(); 
        for(int i=0;i<=n;i++){ 
            while(!empty.isEmpty() && (i==n || nums[empty.peek()]<nums[i])){ 
                int index= empty.pop(); 
                int left=0; 
                if(empty.isEmpty()){ 
                    left=index+1; 
                }
                else{ 
                    left=index-empty.peek();
                } 
                int right=i-index ;
                maxsum+=(long) nums[index]*left*right;
            }
            empty.push(i);
        }
        empty.clear();
        for(int i=0;i<=n;i++){ 
            while(!empty.isEmpty() && (i==n || nums[empty.peek()]>nums[i])){ 
                int index=empty.pop(); 
                int left=0; 
                if(empty.isEmpty()){ 
                    left=index+1; 
                }
                else{ 
                    left=index-empty.peek();
                }
                int right=i-index;
                minsum+=(long) nums[index]*left*right;
            }
            empty.add(i);
        } 
        return (long) maxsum-minsum;
    }
}