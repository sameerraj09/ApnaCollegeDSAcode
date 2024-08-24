import java.util.Stack;

public class q4queueusigstack {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>(); // just for transfer

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // add
        // 3 step
        public void add(int data) {
            // step 1
            while (!s1.isEmpty()) { // agar s1 khali nahi hai to usko palat do s2 me
                s2.push(s1.pop());
            }
            // step 2 aab s1 khali hai
            s1.push(data);// data daal diya aab s2 wala data s1 me daal do
            // step 3
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return s1.pop();
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(0);
        q.add(1);
        q.add(2);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
