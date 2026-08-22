class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]>empty=new ArrayList<>();
        for(int[]current:intervals){ 
            int start=current[0]; 
            int end=current[1]; 
            int i=0; 
            while(i<empty.size()){ 
                int[] existing=empty.get(i); 
                if(start<=existing[1] && end>=existing[0]){ 
                    start=Math.min(start,existing[0]); 
                    end=Math.max(end,existing[1]); 
                    empty.remove(i);
                } 
                else{
                    i++;
                }
            }
            empty.add(new int[]{start,end});
        
        }
        return empty.toArray(new int[empty.size()][]);
    }
}