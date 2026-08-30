class Solution {
    public int minLength(String s) {
        char[] empty=new char[s.length()]; 
        int top=0; 
        for(char c:s.toCharArray()){
            if(top>0 && ((c=='B'&&empty[top-1]=='A')||(c=='D'&&empty[top-1]=='C'))){
                top--;
            } 
            else{
                empty[top++]=c;
            }
        } 
        return top; 
    }
}