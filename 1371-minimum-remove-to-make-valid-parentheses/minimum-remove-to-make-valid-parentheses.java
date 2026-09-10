class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer>empty=new Stack<>(); 
        boolean[] remove=new boolean[s.length()];
        for(int i=0;i<s.length();i++){ 
            char ch=s.charAt(i);
            if(ch=='('){ 
                empty.push(i); 
            }
            else if(ch==')'){ 
                if(empty.isEmpty()){ 
                    remove[i]=true;
                }
                else{ 
                    empty.pop();
                }
            }
        }
        while(!empty.isEmpty()){ 
            remove[empty.pop()]=true;
        }
        StringBuilder ans=new StringBuilder(); 
        for(int i=0;i<s.length();i++){ 
            if(!remove[i]){ 
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}