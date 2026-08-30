class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>empty=new Stack<>();  
        int ans=0;
        for(char ch:s.toCharArray()){ 
            if(ch=='('){ 
                empty.push(ch);
            } 
            else{ 
                if(!empty.isEmpty()){ 
                    empty.pop();
                }
                else{  
                    ans++;

                }
            }
        } 
        return ans+empty.size(); 
    }
}