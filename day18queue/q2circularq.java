public class q2circularq {
    static class queu {
        static int arr[];
        static int size;
        static int rear;
        static int front;// front is moving not fixed

        queu(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;// both are poiting on same location
        }

        public static boolean isFull() {
            return (rear + 1) % size == front; // front is next to the rear
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("full");
                return;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;

            if (front == -1) {
                front = 0;
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }

            int result = arr[front];

            // last element ko delete kar rahe hai
            if (rear == front) {
                rear = front = -1;
            } else {
                // change the front now not rear aab ham fron ko shif kar rahe sarre element ko
                // nahi
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front]; // front is moving not fixed
        }
    }

    public static void main(String[] args) {
        queu q = new queu(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
