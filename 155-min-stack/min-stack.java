import java.util.*;

class MinStack {

    Stack<Integer> min;
    Stack<Integer> s;

    public MinStack() {
        min = new Stack<>();
        s = new Stack<>();
    }

    public void push(int value) {
        s.push(value);

        if (min.isEmpty() || min.peek() >= value) {
            min.push(value);
        }
    }

    public void pop() {
        int temp = s.pop();

        if (min.peek() == temp) {
            min.pop();
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min.peek();
    }
}