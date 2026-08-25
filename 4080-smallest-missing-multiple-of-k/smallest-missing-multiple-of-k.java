import java.util.HashSet; 
import java.util.*;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>empty=new HashSet<>(); 
        for(int num:nums){ 
            empty.add(num); 
        } 
        int multiple=k; 
        while(empty.contains(multiple)){ 
            multiple+=k; 
        } 
        return multiple; 
    }
}