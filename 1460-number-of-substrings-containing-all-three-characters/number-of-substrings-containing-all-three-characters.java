class Solution {
    public int numberOfSubstrings(String s) {
        int LastA=-1; 
        int LastB=-1; 
        int LastC=-1; 
        int count=0; 
        for(int i=0;i<s.length();i++){ 
            char ch=s.charAt(i); 
            if(ch=='a'){ 
                LastA=i; 
            }
            else if(ch=='b'){ 
                LastB=i ;
            }
            else{
                LastC=i; 
            }
        int minvalue=Math.min(LastA,Math.min(LastB,LastC)); 
        count+=minvalue+1; 
        }
        return count;
    }
}