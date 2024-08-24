import java.util.*;

public class tree1 {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.right =null;
            this.left = null;
        }
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum  =sum(root.left);
        int rightsum = sum(root.right);
        return leftsum+rightsum+root.data;
    }
    public static void levelorder(Node root){
        if(root==null){
            return ;
        }
            Queue<Node> q1 = new LinkedList<>();
            q1.add(root);
            q1.add(null);
           
            while(!q1.isEmpty()){
                Node x = q1.remove();
                if(x==null){
                    System.out.println();
                    if(q1.isEmpty()){
                        break;
                    }
                    else{
                        q1.add(null);
                    }
                }
                else{
                    System.out.print(x.data);
                    if(x.left!=null) q1.add(x.left);
                    if(x.right!=null) q1.add(x.right);
                }
            }
        }
            public static List<Integer> moris1(Node root){
                List<Integer> inorder = new ArrayList<>();

            Node curr =  root;
            while(curr!=null){
                if(curr.left = null){
                    inorder.add(curr.data);
                    curr = curr.right;
                }
                else{
                    Node prev=  curr.right;
                    while(prev.right!=null &&prev.right!=curr){
                        prev = prev.right;
                    }
                    if(prev.right==null){
                        prev.right = curr;
                        curr= curr.left;
                    }
                    else{
                        prev.right=null;
                        inorrder.add(curr.data);
                        curr=curr.right;
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
     levelorder(root);
     System.out.println(moris1(root));
     System.out.println(sum(root));
    }
}
