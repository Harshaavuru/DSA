class Solution {
    public int minOperations(String[] logs) {
        Stack<String>empty=new Stack<>(); 
        for(String s:logs){ 
            if(s.equals("../")){ 
                if(!empty.isEmpty()){ 
                    empty.pop();
                } 
            } 
            else if(s.equals("./")){ 
                // remain same
            } 
            else{ 
                empty.push(s);
            }
        }
        return empty.size(); 
    }
}
            