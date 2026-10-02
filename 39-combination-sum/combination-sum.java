class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>empty=new ArrayList<>(); 
        solve(candidates,target,0,new ArrayList<>(),empty); 
        return empty ; 
    }
    void solve(int[] candidates,int target,int index,List<Integer>curr,List<List<Integer>>empty){
        if(index==candidates.length){ 
            return; 
        }
        if(target==0){ 
            empty.add(new ArrayList<>(curr)) ; 
            return ; 
        }
        if(candidates[index]<=target){ 
            curr.add(candidates[index]); 
            solve(candidates,target-candidates[index],index,curr,empty);  
            curr.remove(curr.size()-1); 
        } 
        solve(candidates,target,index+1,curr,empty) ; 
    }
}