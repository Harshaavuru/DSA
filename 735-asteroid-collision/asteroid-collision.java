class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer>empty=new ArrayList<>(); 
        for(int asteriod:asteroids){ 
            empty.add(asteriod); 
        } 
        boolean collision=true; 
        while(collision){ 
            collision=false; 
            for(int i=0;i<empty.size()-1;i++){ 
                int left=empty.get(i); 
                int right=empty.get(i+1); 
                if(left>0 && right<0){ 
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
        int[]res=new int[empty.size()]; 
        for(int i=0;i<empty.size();i++){ 
            res[i]=empty.get(i);
        }
        return res; 
    }
}