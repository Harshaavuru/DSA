class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer>empty=new ArrayList<>(); 
        for(int asteroid:asteroids){ 
            empty.add(asteroid);
        }  
        boolean collision=true; 
        while(collision){ 
            collision=false;
            for(int i=0;i<empty.size()-1;i++){ 
                int left=empty.get(i); 
                int right=empty.get(i+1); 
                while(left>0 && right<0){ 
                    collision=true; 
                    if(Math.abs(left)>Math.abs(right)){ 
                        empty.remove(i+1);
                    } 
                    else if(Math.abs(left)<Math.abs(right)){ 
                        empty.remove(i);
                    } 
                    else{ 
                        empty.remove(i+1);  
                        empty.remove(i);
                    } 
                    break;
                }
            }
        } 
        int ans[]=new int[empty.size()]; 
        for(int i=0;i<empty.size();i++){ 
            ans[i]=empty.get(i);
        } 
        return ans; 
    }
}