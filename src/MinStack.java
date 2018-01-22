import java.util.LinkedList;
import java.util.List;

public class MinStack {

    /**
     * push(x) -- Push element x onto stack.
     * pop() -- Removes the element on top of the stack.
     * top() -- Get the top element.
     * getMin() -- Retrieve the minimum element in the stack.
     *
     */
    private int currentMin;
    private int cursor = 0;
    private List<Integer> container;

    public MinStack() {
        container = new LinkedList<>();
    }

    private void push(int x) {
        if (container.isEmpty()) {
            container.add(cursor, x);
            currentMin = x;
            cursor++;
        } else {
            currentMin = (x < currentMin)? x : currentMin;
            container.add(cursor, x);
            cursor++;
        }
    }

    private void pop() {
        if (!container.isEmpty()) {
            container.remove(container.size() - 1);
            resetMin();
        }
    }

    private void resetMin() {
        if (!container.isEmpty()) {
            int min = container.get(0);
            for (int i = 1; i < container.size(); i++) {
                min = (min < container.get(i))? min : container.get(i);
            }
            currentMin = min;
        }
    }

    private int top() {
        return container.get(container.size() - 1);
    }

    private int getMin() {
        return currentMin;
    }

//    public static void main(String[] args) {
//        MinStack minStack = new MinStack();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        System.out.println(minStack.getMin());
//        minStack.pop();
//        System.out.println(minStack.top());
//        System.out.println(minStack.getMin());
//    }

}