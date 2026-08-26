import java.util.ArrayList;
class StockSpanner { 
    ArrayList<Integer>empty=new ArrayList<>();
    public StockSpanner() { 
    }  
    public int next(int price){  
        empty.add(price);
        int span=1; 
        for(int i=empty.size()-2;i>=0;i--){ 
            if(empty.get(i)<=price){ 
                span++;
            }
            else{ 
                break;
            }
        } 
        return span; 
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */