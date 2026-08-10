class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq=new int[26]; 
        for(char ch:s.toCharArray()){ 
            freq[ch-'a']++;
        }
        StringBuilder stack=new StringBuilder(); 
        boolean[]used=new boolean[26]; 
        for(char ch:s.toCharArray()){ 
            int index=ch-'a'; 
            if(used[index]){ 
                freq[index]--; 
                continue;
            }
            while(stack.length()>0 && stack.charAt(stack.length()-1)>ch && freq[stack.charAt(stack.length()-1)-'a']>0){
                char remove=stack.charAt(stack.length()-1); 
                stack.deleteCharAt(stack.length()-1); 
                used[remove-'a']=false; 
             
            } 
            stack.append(ch); 
            used[index]=true;
            freq[index]--;
        }
        return stack.toString();
    }
}
