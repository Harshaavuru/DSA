class Solution {
    public int minLength(String s) {
        Stack<Character>empty=new Stack<>();
        for(char ch:s.toCharArray()){ 
            if(!empty.isEmpty()&&((empty.peek()=='A' && ch=='B')||(empty.peek()=='C'&& ch=='D'))){ 
                empty.pop();
            }
            else{
            empty.push(ch);
        }
        }
        return empty.size();
    }
}