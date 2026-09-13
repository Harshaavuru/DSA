class Solution {
    public int totalFruit(int[] fruits) {
        int left=0; 
        int basket=0; 
        HashMap<Integer,Integer>empty=new HashMap<>(); 
        for(int right=0;right<fruits.length;right++){ 
            empty.put(fruits[right],empty.getOrDefault(fruits[right],0)+1);
            while(empty.size()>2){ 
                int fruit=fruits[left]; 
                empty.put(fruit,empty.get(fruit)-1); 
                if(empty.get(fruit)==0){
                    empty.remove(fruit);
                }
                left++; 
            }
        basket=Math.max(basket,right-left+1);
    }
    return basket;
    }
}