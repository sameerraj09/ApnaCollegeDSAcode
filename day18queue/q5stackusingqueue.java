import java.util.*;

public class q5stackusingqueue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // dono ko check karo
        // dono queues khali hai tabhi stack khali hai
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // add
        // jo bhi non-empty hai, usme add karo
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // pop
        // sabse pehle q1 ke saare elements ko q2 me daalo, last ko chhod ke, last wala ko return karo
        public static int pop() {
            if (isEmpty()) {
                System.out.println("stack khali hai");
                return -1;
            }
            int top = -1;
            //case 1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove(); // top me last element save hai q1 ka
                    // ab sare elements q2 me daal do, ek ko chhod ke, aur fir top return karo
                    // case 1
                    if (q1.isEmpty()) {
                        break;
                    }
                    // agar last element nahi hai, to q2 me add kar do top ko
                    q2.add(top);
                }
            }
             else {
                while (!q2.isEmpty()) {
                    top = q2.remove(); // top me last element save hai q2 ka
                    // ab sare elements q1 me daal do, ek ko chhod ke, aur fir top return karo
                    // case 1
                    if (q2.isEmpty()) {
                        break;
                    }
                    // agar last element nahi hai, to q1 me add kar do top ko
                    q1.add(top);
                }
            }
    
            return top;
        
    }
    
        // peek
        // stack ka top element return karo, remove nahi karte hue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("stack khali hai");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove(); // top me last element save hai q1 ka
                    q2.add(top);
                }
            }
                
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove(); // top me last element save hai q2 ka
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}


