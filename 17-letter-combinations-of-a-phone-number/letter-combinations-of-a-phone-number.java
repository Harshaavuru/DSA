class Solution { 
    String[] map={ 
        "","","abc","def","ghi", 
        "jkl","mno","pqrs","tuv","wxyz" 
    };
    public List<String> letterCombinations(String digits) {
        List<String>empty=new ArrayList<>() ; 
        if(digits.length()==0){ 
            return empty ;
        }
        solve(digits,0,"",empty) ;
        return empty ; 
    }
    void solve(String digits,int index,String current,List<String>empty){ 
        if(index==digits.length()){ 
            empty.add(current); 
            return ;
        }
        String letters=map[digits.charAt(index)-'0'] ; 
        for(int i=0;i<letters.length();i++){ 
            char ch=letters.charAt(i); 
            solve(digits,index+1,current+ch,empty); 
        }
    }
}