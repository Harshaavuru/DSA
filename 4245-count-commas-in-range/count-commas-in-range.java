class Solution {
    public int countCommas(int n) {
        int maxcommas=0; 
        for(int i=0;i<=n;i++){ 
            String s=String.valueOf(i); 
            int formula=(s.length()-1)/3;
            maxcommas+=formula; 
        }
        return maxcommas; 
    }
}