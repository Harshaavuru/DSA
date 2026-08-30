class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>empty=new Stack<>();
        for(String token:tokens){ 
            if(!token.equals("+")&& 
               !token.equals("-")&& 
               !token.equals("*")&& 
               !token.equals("/")){ 
                empty.push(Integer.parseInt(token)); 
               } 
               else{ 
                int b=empty.pop(); 
                int a=empty.pop(); 
                if(token.equals("+")){ 
                    empty.push(a+b);

                } 
                else if(token.equals("-")){
                    empty.push(a-b);
                } 
                else if(token.equals("*")){ 
                    empty.push(a*b);
                }
                else{ 
                    empty.push(a/b);
                }
                }
        }
        return empty.pop();
    }
}