import java.util.*;

public class dequeue1 {
    public static void main(String[] args) {
        
    
    Deque<Integer> deque = new LinkedList<>();
   deque.addFirst(2);  //2
    deque.addFirst(1);  //1 2
    deque.addLast(3);  //1 2 3
    deque.addLast(4);  //1 2 3 4
    System.out.println(deque);
    deque.removeLast();//1 2 3
    System.out.println("first el ="+deque.getFirst());//1 
    System.out.println("last el ="+deque.getLast());//2
    



}
}