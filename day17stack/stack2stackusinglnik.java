public class stack2stackusinglnik {
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class stack {
        static Node head = null;

        // Check if stack is empty
        public static boolean isEmpty() {
            return head == null;  // Use '==' for comparison
        }

        // Push operation: Adding element at the beginning
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;  // If there's no element, add at the beginning
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        // Pop operation: Removing from the beginning
        public static int pop() {
            if (isEmpty()) {
                return -1;  // Return -1 for empty stack
            } else {
                int top = head.data;
                head = head.next;
                return top;
            }
        }

        // Peek operation: Get the top element without removing
        public static int peek() {
            if (isEmpty()) {
                return -1;  // Return -1 for empty stack
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        // Print and pop all elements
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
