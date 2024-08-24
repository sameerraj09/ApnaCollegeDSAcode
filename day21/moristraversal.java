import java.util.ArrayList;
import java.util.List;

public class moristraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> morrisTraversal(Node root) {
        List <Integer> inorder = new ArrayList<>();
        Node curr = root;
        while(curr!=null){
            if(curr.left==null){
                inorder.add(curr.data);
                curr=curr.right;
            }
            else{
                Node prev = curr.left;
                while(prev.right!=null && prev.right!=curr){
                    prev = prev.right;
                }

                if(prev.right==null){
                    prev.right=curr; //make thread
                    curr = curr.left;  //and go to left
                }
                else{   //already there is thread
                    prev.right= null;  //remove thread 
                    inorder.add(curr.data); //add to queue 
                    curr=curr.right; //go to the right side


                }
            }
        }
        return inorder;
      
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> result = morrisTraversal(root);
        System.out.println(result);  // Expected output: [4, 2, 5, 1, 6, 3, 7]
    }
}
