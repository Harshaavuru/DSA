class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26]; 
        int left=0; 
        int ans=0; 
        int maxfreq=0; 
        for(int right=0;right<s.length();right++){ 
            int index=s.charAt(right)-'A'; 
            freq[index]++; 
            maxfreq=Math.max(maxfreq,freq[index]); 
            int length=right-left+1; 
            int replace=length-maxfreq; 
            while(replace>k){ 
                int leftindex=s.charAt(left)-'A'; 
                freq[leftindex]--; 
                left++; 
                length=right-left+1; 
                replace=length-maxfreq; 
            } 
            ans=Math.max(ans,length); 
        }
        return ans;
    }
}