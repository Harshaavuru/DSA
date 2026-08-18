class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>ans=new Stack<>(); 
        ans.add(-1);
        int maxlen=0; 
        for(int i=0;i<s.length();i++){ 
            if(s.charAt(i)=='('){ 
                ans.push(i);
            } 
            else{ 
                ans.pop(); 
                if(ans.isEmpty()){  
                    ans.push(i);
                }
                else{ 
                    int length=i-ans.peek();
                    maxlen=Math.max(maxlen,length);
                }
            }
        }
        return maxlen; 
    }
}