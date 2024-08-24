import java.util.ArrayList;
import java.util.List;

public class morisrevision {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }
    public static List<Integer> morisstraversal(Node root){
        List <Integer> inorder = new ArrayList<>();
        Node curr = root;
        while(curr!=null){
            if(curr.left==null){
                inorder.add(root.data);
                curr = curr.right;

            }
            else{
                Node prev  = curr.left;
                while(prev.right!=null &&prev.right!=curr){
                    prev=prev.right;
                }
                if(prev.right=null){
                    prev.right=curr;
                    curr=curr.left;
                }
                else{
                    prev.right=null;
                    inorder.add(curr.data);
                    curr=curr.right;
                    
                }
            }
        }
    }
}
