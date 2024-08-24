public class linkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next =null;
        }
        public static Node head;
        public static Node tail;
        public static int height;
        public static void addfirst(int data){
            //creating a new node
            Node newnode = new Node(data);
            size++;
            if(head==null){
               head  =  tail = newnode;
            }
            newnode.next = head;
            head = newnode;
        }
        public static void main(String[] args) {
            linkedlist l1 =new linkedlist();
            l1.addfirst(2);
            l1.addfirst(3);
            l1.addfirst(4);
            l1.addfirst(5);
            l1.addfirst(6);
            l1.addfirst(7);
            System.out.println(size);
        }
    }
}
