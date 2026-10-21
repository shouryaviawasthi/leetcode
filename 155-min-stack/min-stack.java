import java.util.Stack;

class MinStack {

    Stack<Integer> val = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
    }

    public void push(int value) {
        val.push(value);

        // Store duplicate minimum values also
        if (min.isEmpty() || value <= min.peek()) {
            min.push(value);
        }
    }

    public void pop() {
        if (val.isEmpty()) {
            return;
        }

        int del = val.pop();

        // Remove matching minimum
        if (del == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        return val.peek();
    }

    public int getMin() {
        return min.peek();
    }
}