import q3usinglinkedlist.Queue;

public class leftview {
    public class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right=null;
        }
        public static void leftview(Node left){
            if(root==null){
                return ;
            }
            Queue<Integer>
        } 
    }
    public static void main(String[] args) {
        Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left= new Node(4);
         root.left.right = new Node(5);
         leftview(root);
    }

}