class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>result=new ArrayList<>() ; 
        solve(1,k,n,new ArrayList<>(),result); 
        return result ; 
    }
    void solve(int num,int k,int target,List<Integer>empty,List<List<Integer>>result){ 
        if(empty.size()==k){ 
            if(target==0){ 
                result.add(new ArrayList<>(empty)) ; 
            }
            return ;
        }
        if(num>9){ 
            return ;
        }
        if(num<=target){
            empty.add(num); 
            solve(num+1,k,target-num,empty,result) ; 
            empty.remove(empty.size()-1); 
        }
        solve(num+1,k,target,empty,result) ;
    }
}