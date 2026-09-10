class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>empty=new Stack<>(); 
        empty.push(-1); 
        int maxlen=0; 
        for(int i=0;i<s.length();i++){ 
            if(s.charAt(i)=='('){ 
                empty.push(i);
            }
            else{ 
                empty.pop(); 
                if(empty.isEmpty()){ 
                    empty.push(i);
                } 
                else{ 
                    int length=i-empty.peek(); 
                    maxlen=Math.max(maxlen,length);
                }
            }
        } 
        return maxlen; 
    }
}