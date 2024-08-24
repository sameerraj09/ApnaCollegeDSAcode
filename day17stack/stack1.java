import java.util.*;

public class stack1 {
    public static class stack {
        // We are creating a stack using an ArrayList
        // Create an ArrayList first
        private ArrayList<Integer> list = new ArrayList<>();

        // Check if stack is empty
        public boolean isEmpty() {
            return list.isEmpty();
        }

        // Push operation
        public void push(int data) {
            list.add(data);
        }

        // Pop operation
        public int pop() {
            // if (isEmpty()) {
            //     throw new EmptyStackException();
            // }
             int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek operation
        public int peek() {
            // if (isEmpty()) {
            //     throw new EmptyStackException();
            // }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        stack1.stack s = new stack1.stack();
        s.push(1);   // Pushing the value
        s.push(2);
        s.push(3);
        
        // Seeing all the values
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();  // Deleting the top value
        }
    }
}
