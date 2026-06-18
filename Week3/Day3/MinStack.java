package Week3.Day3;

import java.util.Stack;

public class MinStack {
    private Stack<Long> st;
    private long min;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int x) {
        long val = (long) x;
        if (st.isEmpty()) {
            st.push(val);
            min = val;
        } else if (val >= min)
            st.push(val);
        else if (val < min) {
            st.push(2 * val - min);
            min = val;
        }

    }

    public void pop() {
        if (st.isEmpty())
            return;
        else if (st.peek() > min)
            st.pop();
        else if (st.peek() <= min) {
            min = 2 * min - st.peek();
            st.pop();
        }

    }

    public int top() {
        if (st.size() == 0)
            return -1;
        if (st.peek() >= min) {
            long ans = st.peek();
            return (int) ans;
        }
        return (int) min;
    }

    public int getMin() {
        return (int) min;
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();

        ms.push(-2);
        ms.push(0);
        ms.push(-3);

        System.out.println("getMin = " + ms.getMin());

        ms.pop();

        System.out.println("top = " + ms.top());
        System.out.println("getMin = " + ms.getMin());
    }
}