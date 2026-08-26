class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length; 
        int[] ans=new int[n]; 
        Stack<Integer>empty=new Stack<>(); 
        for(int i=0;i<n;i++){ 
            while(!empty.isEmpty() && temperatures[i]>temperatures[empty.peek()]){
                int prev=empty.pop(); 
                ans[prev]=i-prev; 
            } 
            empty.push(i);
        } 
        return ans; 
    }
}