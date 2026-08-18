class MyStack {  
    Queue<Integer>empty=new LinkedList<>();
    public MyStack() { 
    }
    
    public void push(int x) { 
        empty.add(x); 
        int size=empty.size(); 
        for(int i=0;i<size-1;i++){ 
            empty.add(empty.remove());
        }
        
    }
    
    public int pop() {
        return empty.remove();
    }
    
    public int top() {
        return empty.peek();
    }
    
    public boolean empty() {
        return empty.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */