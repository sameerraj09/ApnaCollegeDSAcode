import java.util.*;
//simple approach just push the element from the queue to stack and then pop the element form the stack to the queue
public class q7reversal {

    public static void reverse(Queue<Integer> q){
        String str = "";
        
        // Convert queue elements to a string
        while(!q.isEmpty()){
            str += q.remove();
        }

        // Reverse the string
        str = new StringBuilder(str).reverse().toString();

        // Convert reversed string back to the queue
        for (int i = 0; i < str.length(); i++) {
            q.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
    }

    public static void reverse1(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        
        // Push elements from queue to stack
        while(!q.isEmpty()){
            s.push(q.remove());
        } 
        
        // Pop elements from stack and push to queue
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        reverse(q);
        
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();  // newline
        
        reverse1(q);
        
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
