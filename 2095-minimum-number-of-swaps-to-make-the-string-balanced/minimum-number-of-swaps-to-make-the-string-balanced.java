class Solution {
    public int minSwaps(String s) {
        int unmatched=0; 
        for(int i=0;i<s.length();i++){ 
            char ch=s.charAt(i); 
            if(ch=='['){ 
                unmatched++;
            }
            else if(unmatched>0){ 
                unmatched--;
            }
        } 
        return (unmatched+1)/2;
    }
}