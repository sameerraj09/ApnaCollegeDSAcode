import java.util.*;

public class q6interleave {
    public static void interleave(Queue <Integer>q){
        //create a new queue to store the half value of the queue
        Queue <Integer>firsthalf = new LinkedList<>();
       int size = q.size();
       //storing the first half value 
       for(int i=0;i<size/2;i++){
        firsthalf.add(q.remove());
       }
       //now the logic will work first half ka ek element lo queue me add akro
       while(!firsthalf.isEmpty()){
        q.add(firsthalf.remove());//first half ki vaule remove kar ke 2nd half me daal do ek ek kar ke
        //aab q ki value remove kar ke daal do
        q.add(q.remove());
       }
    }
    public static void main(String[] args) {
        Queue <Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
