import java.util.Comparator;
import java.util.PriorityQueue;

public class objpq {
    static class Student implements Comparable<Student>{ //overriding
        String name;
        int rank;
        public Student(String name,int rank){
            this.name = name;
            this.rank  = rank;
        }
        // 2 parameter for deciciding the rank
        //we are considering the rank for it
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
         public static void main(String[] args) {
        PriorityQueue<Student> pq1 = new PriorityQueue<>();
        pq1.add(new Student("A", 4));
        pq1.add(new Student("y", 3));
        pq1.add(new Student("w", 1));
        pq1.add(new Student("z", 2));
        
    
    while(!pq1.isEmpty()){
        System.out.println(pq1.peek().name+"->"+pq1.peek().rank);
        pq1.remove();
    }
}

}
