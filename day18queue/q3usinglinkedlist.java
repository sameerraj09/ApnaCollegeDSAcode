public class q3usinglinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next =null;
        }
    }
    public static class Queue{
    static Node head = null;
    static Node tail =null;
//first condn
    public static boolean isEmpty(){
        return head==null && tail ==null;
    }
    //no need to is full we can add any no of data

    //add
    public static void add(int data){
        Node newNode = new Node(data);
        //use logic of add element at back
        if(head==null){
            head= tail =newNode;
            return;
        }
        tail.next = newNode;//making link
        tail = newNode; //updating tail
        
    }
    //remove
    public static int remove(){
        if(isEmpty()){
            System.out.println("empty list");
            return -1;
        }
        int front = head.data;//storing front data
       
        //single element
        if(tail==head){
           tail=head=null;
        }
        else{
            head=head.next;//removing head
        }
        return front;
    }
//peek
  public static int peek(){
    if(isEmpty()){
        System.out.println("empty");
    }
    int front = head.data;
    return front;
  }
}   
  public static void main(String[] args) {
    Queue q1 = new Queue(); //no need to pass any argment any no if item can be added
    q1.add(0);
    q1.add(1);
    q1.add(2);
    while(!q1.isEmpty()){
        System.out.println(q1.peek());
        q1.remove();
    }

  }
    
}
