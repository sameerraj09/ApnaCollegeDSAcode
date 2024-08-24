import java.util.*;
public class linkedlist1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step 1 create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {// if ll is empty
            head = tail = newNode;// make head and tail both to the linked list
            return;
        }

        // step 2 newnode next = head
        newNode.next = head;// forwand link
        // step 3 making new node as head
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            newNode = tail = head;
        }

        tail.next = newNode;//backward link
        tail = newNode;
    }
 //print 
 public void print(){
    if(head == null){
        System.out.println("LL is empty");
        return;
    }
 Node temp  = head;//head ko temp me store karo
 while(temp!= null){ //temp ko tab tak iterate karo jab tak temp ka value null nahi hota
System.out.print(temp.data+"->");//temp ka data print karte rahe
temp = temp.next;//temp ko aage badhate jao
 }
 System.out.println("null");
 } 
//add element at given index
 public void add(int indx,int data){
    if(indx ==0){ //for 0th index
        addFirst(data);//no need to do i++ bcs already did in addFirst function
        return;
    }
    Node newNode = new Node(data);//creating a node havig data in it 
    size++;
    Node temp = head;  //storing head in temp
    int i =0;   //to check the idx
    while(i<indx-1){//finding the prev node after which we have to add the new node
   temp =temp.next;//iterating temp 
   i++;
    }
    //now my temp is on the prev node after that node we have to add our new node
    //to add node at that place
    //step 1 newnode ke next ko temp ke next pe point karo 
    newNode.next = temp.next;
    //step 2 temp ke next ko newnode pe point karo
    temp.next=newNode;
 }

 public int removeFirst(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
    int val = head.data;
    head=tail=null;
    size=0;//adjusting size
    return val;    
    }
    int val = head.data;//val ke andar head ka data
    head = head.next; //head ke next ko jead bana diya
    size--;
    return val;//value store kara diya
 }
 public int removeLast(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
    int val = head.data;
    head=tail=null;
    size=0;//adjusting size
    return val;    
    }
    Node prev = head;  //storing head in prev
    int i =0;   //to check the current position
    //prev:1 =size-2
    while(i<size-2){//finding the prev node of tail node
   prev =prev.next;//iterating prev
   i++;
    }
    // for(int i =0;i<size-2;i++){
    //     prev=prev.next;
    // }
    int val = prev.next.data;//tail.data;//val ke andar tail ka data
    prev.next=null;//prev ke next ko null
    tail=prev;//tail ko prev pe mark karo
    size--;
    return val;//value store kara diya
 }
public int itrsearch(int key){
    int i =0;
    Node temp = head;//assigning head to temp
    while(temp!=null){ //interating through out the ll
   if(key==temp.data){//key found
    return i;
   }
   temp=temp.next;
   i++;
}
    return -1;
   }
   public int helper(Node head, int key) {
    if (head == null) { // Base case: if the current node is null
        return -1; // Key not found
    }
    if(head.data==key){
        return 0;//if found return 0 and during coming back increase the idx value  
    }
    int idx = helper(head.next, key); // Recursive call with the next node
    if (idx == -1) { // If key not found in subsequent nodes
        return -1;
    }
    return idx + 1; // If found during recursive calls, increase the index
}

public int recsearch(int key) {
    return helper(head, key); // Call the helper function with the head of the linked list
}
public void reverse(){
    //3 variable and 4 step
    Node prev =null;//in starting prev = null
    Node curr = tail=head;//avi hi tail ko head bana diya head ki value tail me store hui fir tail ki curr me
    //avi next ko nahi loop me karna hai usko
    while(curr!=null){//going till last
      Node next = curr.next; //next ko current ka nect
         curr.next = prev;  //current ke next ko previous pe point reversing the link
         prev = curr;//current ko prev banao
         curr = next;//next ko current banao
    }
    head = prev; //aab head ko bana do joki prev hoga kyoki curr to null hogaya hai
}

//delete from nth 
public void deletenthfromemd(int n){
   //to calculate the size of the element
   int sz = 0;
   Node temp = head;
   while(temp!=null){
    temp =temp.next;
    sz++;
   }  
   if(n==sz){
    head=head.next;//remove first
   }
   //sz-n
   int i=1;
   int itofind=sz-n;//from start node position
   Node prev = head;//prev me head dala
   while(i<itofind){//prev tak jane ka loop
  prev = prev.next;//prev to iterate karana
  i++;
   }
   //aab prev pe aagaye hai
   prev.next = prev.next.next;//prev ke next ko prev ke next ke next node pe point katna
   return;
}

//parilndrone
//step 1 find middle node
public Node findmid(Node head){
    Node slow = head;
    Node fast =head;
    while(fast!=null && fast.next!=null){//for even and odd
        slow = slow.next;//+1
        fast = fast.next.next;//+2      
    }
    return slow;
}
//step 2 reverse the second half   
public boolean checkpalindrome(){
    if(head==null ||head.next==null){//if node is empty and only one element
       return true; 
    }
  //step1 find mid
  Node midNode =findmid(head);
  //step2 reverse 2nd half
  Node prev = null;
  Node curr=midNode;
  Node next;
  while(curr!=null){//going till last
     next = curr.next; //next ko current ka next
       curr.next = prev;  //current ke next ko previous pe point reversing the link
       prev = curr;//current ko prev banao
       curr = next;//next ko current banao
  }
  
Node right = prev;//right half head
Node left =head;
  //step 3 check left half and right half 
  while(right!=null){//data ki value chack karo 
    if(right.data!=left.data){
        return false;   
    }
  
  left = left.next;
  right  = right.next;
}
return true;
}

public static boolean iscycle(){
Node slow =head;
Node fast = head;
while(fast!=null &&fast.next!=null){
    slow = slow.next;//one step
    fast =fast.next.next;//two step
    if(slow==fast){
        return true;//cycle exist
    }
}
return false;
}

//REMOVE CYCLE
public static void removeCycle() {
    // Detect cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (fast == slow) {
            cycle = true;
            break;
        }
    }
    if (!cycle) {
        return; // No cycle detected
    }

    // Find cycle start
    slow = head;//fast wahi rahega slow head pe jayega 
   Node prev =null;//last node will store under prev
    while (slow != fast) {
        //prev = head;
        slow = slow.next;
        fast = fast.next;
    }
    prev.next = null;
}

//merge sort
private Node getMid(Node head){ //finding the middle value
    Node slow = head;
    Node fast = head;
    while(fast.next!=null &&fast.next.next!=null){//taking right side left middle
   slow  = slow.next;//it will be on mid when fast reach to the null
   fast= fast.next.next; 
    }
    return slow;//mid node
}
//merge function

private Node merge(Node head1,Node head2){  //take to ll and merge by comapring the value
    Node mergedLL =new Node(-1);
    Node temp  = mergedLL;
    while(head1 != null && head2 != null){
      if(head1.data<=head2.data){ //comparing the data
        temp.next = head1;//adding head1 in to the new ll
        head1=head1.next;  //interating the head
      }
      else{
        temp.next=head2;   //other wise add head2

        head2 = head2.next;

      }
      temp =temp.next;
    }
    if(head1!=null){
        temp.next=head1;  //if some value left add it
    
    }
    if(head2!=null){
        temp.next=head2; //if some value left add it
    
    }
    return mergedLL.next;//bcs at first it is -1
}
public Node mergesort(Node head){
if(head==null || head.next==null){  //agar khali hai to 
return head;
}

    //to find mid
Node mid =getMid(head);
Node righHead = mid.next;//making head of the right list
mid.next = null;//breaking the linked list
Node newLeft=mergesort(head);  
Node newRight = mergesort(righHead);
//merge
return merge(newLeft,newRight);
}
// zig zag

public void zigzag(){
//find mid
Node slow = head;
Node fast = head.next;
while(fast!=null &&fast.next!=null){
    slow = slow.next;
    fast = fast.next;
}
Node mid = slow;
//reverse 2nd half;
//3 var
//4 step
Node curr = mid.next;
mid.next = null;//breaking the list
Node prev = null;
Node next;
while(curr!=null &&curr.next!=null){
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;  
}
Node left = head;
Node right = prev;
//2 variable req
Node nextL,nextR;

//alt merge-zig-zag merge
while(left!=null &&right!=null){
    nextL=left.next;
    left.next=right;
    nextR=right.next;
    right.next=nextL;
    
    left=nextL;
    right=nextR;


    //pending zig zag 3 min
}
}
  public static void main(String[] args) {
         linkedlist1 ll = new linkedlist1();
       //ll.print();
       ll.addFirst(1);
    //    // ll.print();
         ll.addFirst(2);
         ll.addFirst(3);
         ll.addFirst(4);
         ll.addFirst(5);
         ll.print();
         ll.head=ll.mergesort(ll.head);
         ll.print();

         ll.zigzag();
         ll.print();
    //     ll.addLast(2);
    //    // ll.print();
    //     ll.addLast(1);
    //    ll.add(2,3);//adding value at 2nd index
    //    ll.print();
        // System.out.println("size of linked list ="+size);
        // ll.removeFirst();
        // System.out.println("After removing the first value");
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeLast();
        // System.out.println("after removing last element");
        // ll.print();
        // System.out.println(ll.size);
        // ll.addFirst(1);
        // ll.addLast(5);
        // System.out.println("after adding the deleted value");
        // ll.print();
        // System.out.print("key found at : ");
        // System.out.println(ll.recsearch(5));
       // ll.reverse();
        //ll.print();
        //ll.deletenthfromemd(2);//deleting 4
       // ll.print();
//  head = new Node(1);
//  Node temp =new Node(2);
//  head.next=temp;
//  head.next.next=new Node(3);
//  head.next.next.next =temp;//cycle exist
//      System.out.println(iscycle());
//      removeCycle();
//      System.out.println(iscycle());
     
    }
}
