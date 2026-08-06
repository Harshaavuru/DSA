import java.util.Stack; 
import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length; 
        int ans=0; 
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<=n;i++){ 
            while(!stack.isEmpty() &&(i==n || heights[stack.peek()]>heights[i])){ 
                int height=heights[stack.pop()]; 
                int left=stack.isEmpty() ? -1 :stack.peek();
                int width=i-left-1;
                ans=Math.max(ans,height*width); 
            } 
            stack.push(i);
        }
        return ans; 
    }
}