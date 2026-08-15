class Solution {
    public String decodeString(String s) { 
        Stack<Integer>numstack=new Stack<>(); 
        Stack<String>strstack=new Stack<>(); 
        String ans=""; 
        int num=0; 
        for(char ch:s.toCharArray()){ 
            if(Character.isDigit(ch)){ 
                num=num*10+(ch-'0');
            } 
            else if(ch=='['){ 
                numstack.push(num); 
                strstack.push(ans);
                ans="";
                num=0;
            } 
            else if(ch==']'){ 
                int repeat=numstack.pop(); 
                String previous=strstack.pop(); 

                ans=previous+ans.repeat(repeat);
            } 
            else{ 
                ans+=ch;
            }
        } 
        return ans; 
    }
}