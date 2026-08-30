class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>empty1=new Stack<>(); 
        Stack<Character>empty2=new Stack<>();
        for(char ch:s.toCharArray()){ 
            if(ch=='#'){ 
                if(!empty1.isEmpty()){ 
                    empty1.pop();
                } 
            } 
            else{ 
                empty1.push(ch);
            } 
        } 
        for(char ch:t.toCharArray()){ 
            if(ch=='#'){ 
                if(!empty2.isEmpty()){ 
                    empty2.pop();
                }
            }
            else{ 
                empty2.push(ch);
            } 
        }
        return empty1.equals(empty2);
    }
}