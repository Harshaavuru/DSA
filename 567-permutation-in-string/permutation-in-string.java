class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length(); 
        int n=s2.length(); 
        if(m>n){ 
            return false ;
        } 
        char[] original=s1.toCharArray(); 
        Arrays.sort(original); 
        // need to finfd substring fromm s2 
        for(int i=0;i<=n-m;i++){ 
            String sub=s2.substring(i,i+m); 
            char[] temp=sub.toCharArray(); 
            Arrays.sort(temp); 

            if(Arrays.equals(original,temp)){  
                return true;
            }

        }
        return false; 
    }
}