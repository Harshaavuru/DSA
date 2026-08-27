class Solution {
    public int calculate(String s) {
        Stack<Integer>empty=new Stack<>(); 
        int num=0;
        char sign='+'; 
        for(int i=0;i<s.length();i++){ 
            char ch=s.charAt(i); 
            if(Character.isDigit(ch)){ 
                num=num*10+(ch-'0'); 
            }
            if((!Character.isDigit(ch) && ch!=' ') || i==s.length()-1 ){ 
                if(sign=='+'){ 
                    empty.push(num);
                } 
                else if(sign=='-'){ 
                    empty.push(-num);
                } 
                else if(sign=='*'){ 
                    empty.push(empty.pop()*num);
                } 
                else if(sign=='/'){ 
                    empty.push(empty.pop()/num);
                } 
                sign=ch; 
                num=0;
            }
        }
        int res=0; 
        for(int x:empty){ 
            res+=x;
        }
        return res; 
    }
}
    