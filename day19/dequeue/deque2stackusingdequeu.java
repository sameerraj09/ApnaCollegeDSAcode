import java.util.*;

public class deque2stackusingdequeu {
    static class Stack {
        Deque<Integer> d = new LinkedList<>();

        // add operation
        public void push(int data) {
            d.addLast(data);
        }

        // remove
        public int pop() {
            return d.removeFirst();
        }

        // peek
        public int peek() {
            return d.getFirst();
        }

        // isEmpty
        public boolean isEmpty() {
            return d.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
