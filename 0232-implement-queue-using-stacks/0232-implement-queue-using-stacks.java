class MyQueue {
    
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while(!stack1.empty()){
            int popped = stack1.pop();
            stack2.push(popped);
        }
        int out = stack2.pop();
        while(!stack2.empty()){
            int popped = stack2.pop();
            stack1.push(popped);
        }
        return out;
    }

    public int peek() {
        while(!stack1.empty()){
            int popped = stack1.pop();
            stack2.push(popped);
        }
        int peek = stack2.peek();
        while(!stack2.empty()){
            int popped = stack2.pop();
            stack1.push(popped);
        }
        return peek;
    }

    public boolean empty() {
        return stack1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */