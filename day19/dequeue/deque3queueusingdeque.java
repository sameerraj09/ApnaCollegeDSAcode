import java.util.Deque;
import java.util.LinkedList;

public class deque3queueusingdeque {
    static class queue {
        Deque<Integer> d = new LinkedList<>();

        // add operation
        public void add(int data) {
            d.add(data);
        }

        // remove
        public int remove() {
            return d.removeLast();
        }

        // peek
        public int peek() {
            return d.getLast();
        }

        // isEmpty
        public boolean isEmpty() {
            return d.isEmpty();
        }
    }

    public static void main(String[] args) {
        queue d = new queue();
        d.add(1);
        d.add(2);
        d.add(3);
        while (!d.isEmpty()) {
            System.out.println(d.peek());
            d.remove();
        }
    }
}
