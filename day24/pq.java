import java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;
public class pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.add(3);
        pq1.add(4);
        pq1.add(2);
        pq1.add(1);
    
    while(!pq1.isEmpty()){
        System.out.println(pq1.peek());
        pq1.remove();
    }
}
}