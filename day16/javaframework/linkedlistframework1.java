import java.util.LinkedList;
public class linkedlistframework1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
