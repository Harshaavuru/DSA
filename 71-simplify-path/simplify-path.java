import java.util.Stack;
class Solution {
    public String simplifyPath(String path) {
        Stack<String>stack=new Stack<>(); 
        String[] parts=path.split("/"); 
        for(String part:parts){ 
            if(part.equals("") ||part.equals(".")){ 
                continue;
            } 
            if(part.equals("..")){ 
                if(!stack.isEmpty()){ 
                    stack.pop();
                }
            }   else{ 
                    stack.push(part);
                }
            }
        if(stack.isEmpty()){ 
            return "/";
        }
        StringBuilder sb=new StringBuilder(); 
        for(String dict:stack){ 
            sb.append("/").append(dict); 
            }
        return sb.toString();
        }
}
