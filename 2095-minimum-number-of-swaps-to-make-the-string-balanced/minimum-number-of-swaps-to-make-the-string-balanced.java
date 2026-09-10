class Solution {
    public int minSwaps(String s) {
        Stack<Character>empty=new Stack<>(); 
        for(char ch:s.toCharArray()){ 
            if(ch=='['){ 
                empty.push(ch);
            }
            else{ 
                if(!empty.isEmpty()){ 
                    empty.pop();
                }
            }
        }
        int unmatched=empty.size();
        return (unmatched+1)/2; 
    }
}