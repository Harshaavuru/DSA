class Solution {
    public String makeGood(String s) {
        Stack<Character>empty=new Stack<>(); 
        for(char value:s.toCharArray()){ 
            if(!empty.isEmpty() && Character.toLowerCase(empty.peek())==Character.toLowerCase(value) && Character.isLowerCase(empty.peek())!=Character.isLowerCase(value)){ 
                empty.pop();
            }
            else{
            empty.push(value); 
        } 
        }
        StringBuilder sb=new StringBuilder(); 
        for(char ch:empty){ 
            sb.append(ch);
        } 
        return sb.toString(); 
    }
}