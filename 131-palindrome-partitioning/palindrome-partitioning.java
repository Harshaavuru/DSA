class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>result=new ArrayList<>();  
        solve(s,0,new ArrayList<>(),result); 
        return result; 
    }
    void solve(String s,int index,List<String>current,List<List<String>>result){ 
        // best case 
        if(index==s.length()){ 
            result.add(new ArrayList<>(current)) ;
            return ; 
        }
        for(int i=index;i<s.length();i++){
        String sub=s.substring(index,i+1); 
        if(palindrome(sub)){ 
            current.add(sub);
            solve(s,i+1,current,result); 
            current.remove(current.size()-1) ;
        }
    }
}
    boolean palindrome(String s){ 
        int left=0; 
        int right=s.length()-1; 
        while(left<right){ 
            if(s.charAt(left)!=s.charAt(right)){ 
                return false; 
            }
            left++; 
            right--; 
        }
        return true; 
    }
}