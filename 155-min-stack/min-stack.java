class MinStack {
        Stack<Integer> val = new Stack<>();
        Stack<Integer> min = new Stack<>();
    public MinStack()
    {

    }
    
    public void push(int value) {
        val.push(value);
        if(min.isEmpty() || value<=min.peek())
        min.push(value);
    }
    
    public void pop() {
        if(val.isEmpty())
        return;
        int del = val.pop();
        if(del == min.peek())
        min.pop();
    }
    
    public int top() {
        return val.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */