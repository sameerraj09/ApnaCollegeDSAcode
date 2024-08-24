import java.util.*;

public class stack5revstack {
    
    // Push element to the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return; // Base case
        }
        int top = s.pop(); // Going up
        pushAtBottom(s, data);
        s.push(top); // Coming back
    }

    // Reverse the stack
    public static void reverseStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int top = s.pop(); // Going up
            reverseStack(s); // Recursive call
            pushAtBottom(s, top); // Coming back
        }
    }

    // Print the stack
    public static void printStack(Stack<Integer> s) {
        Stack<Integer> aux = new Stack<>(); // Auxiliary stack to store reversed elements
        while (!s.isEmpty()) {  
            aux.push(s.pop());
        }
        
        while (!aux.isEmpty()) {//printing the value
            System.out.println(aux.pop());
        }
    }

    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> s = new Stack<>();

        // Push elements to the stack (for testing)
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // Reverse the stack
        reverseStack(s);

        // Print the reversed stack
        printStack(s);
    }
}
