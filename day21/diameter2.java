public class diameter2 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left= null;
            this.right = null;
        }
    }
    static class info{
     int diam;
     int ht;
     info(int diam,int ht){
           this.diam=diam;
           this.ht = ht;
     }   
    }
    public static info diameter(Node root) {
  if(root==null){
    return new info(0,0);
  }
   info left= diameter(root.left);
   info right= diameter(root.right);

   int diam = Math.max(Math.max(left.diam,right.diam),left.ht+right.ht+1);
   int ht = Math.max(left.ht,right.ht)+1;
   return new info(diam,ht);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
         root.left = new Node(1);
         root.right= new Node(1);
         root.left.left = new Node(1);
         root.left.right = new Node(1);
         root.right.left = new Node(1);
         root.right.right = new Node(1);
         System.out.println(diameter(root).diam);
    }
}
