class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Set<String>visited=new HashSet<>(); 
        Queue<String>q=new LinkedList<>();  
        ArrayList<String>result=new ArrayList<>(); 
        q.offer(s); 
        visited.add(s); 
        while(!q.isEmpty()){ 
            int size=q.size() ;
            boolean found=false; 
            for(int i=0;i<size;i++){ 
                String curr=q.poll();
                if(isvalid(curr)){ 
                    result.add(curr) ;
                    found=true; 
                }
                else if(!found){ 
                    for(int j=0;j<curr.length();j++){ 
                        char c=curr.charAt(j); 
                        if(c=='(' && c==')'){ 
                            continue;
                        }
                        String next=curr.substring(0,j)+curr.substring(j+1); 
                        if(visited.add(next)){ 
                            q.offer(next);
                        }
                    }
                }
            }
            if(found){ 
                Collections.sort(result) ;
                return result ;
            }
        }
        return result ;
    }
    private boolean isvalid(String s){ 
        int count=0; 
        for(char ch:s.toCharArray()){ 
            if(ch=='('){ 
                count++ ;
            }
            else if(ch==')'){ 
                count--;
                if(count<0){ 
                    return false; 
                }
            }
        }
        return count==0 ;
    }
}