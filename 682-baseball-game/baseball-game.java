class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>ans=new Stack<>(); 
        for(String s:operations){ 
            if(s.equals("C")){ 
                ans.pop();
            } 
            else if(s.equals("D")){ 
                ans.push(ans.peek()*2);
            } 
            else if(s.equals("+")){ 
                int curr=ans.pop(); 
                int prev=ans.peek(); 
                int newdigit=curr+prev;  
                ans.push(curr);
                ans.push(newdigit);
            }
            else{ 
                ans.push(Integer.parseInt(s));
            }
        }
        int sum=0; 
        for(int score:ans){ 
            sum+=score;
        } 
        return sum; 
    } 
}