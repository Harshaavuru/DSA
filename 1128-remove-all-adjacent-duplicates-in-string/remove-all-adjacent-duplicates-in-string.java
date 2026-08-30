class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>empty=new Stack<>();
        for(char ch:s.toCharArray()){ 
            if(!empty.isEmpty()&& empty.peek()==ch){
                empty.pop();
            }
            else
            empty.push(ch);
        }
        StringBuilder sb=new StringBuilder(); 
        for(char ch:empty){ 
            sb.append(ch);
        } 
        return sb.toString();
    }
}