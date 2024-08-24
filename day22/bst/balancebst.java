//find inroder then use the code to create the balanced bst using sorted arr

import java.util.ArrayList;

public class balancebst {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node createbst(ArrayList<Integer> arr,int start,int end){
        if(start>end){
            return null;
        }
        int mid = start+(end-start)/2;
        Node root = new Node(arr.get(mid));
        root.left = createbst(arr, start, mid-1);
        root.right = createbst(arr,mid+1,end);
        return root;
    }
    public static void inorder(Node root,ArrayList<Integer> in){
        if(root == null){
            return ;
        }
        inorder(root.left, in);
        in.add(root.data);
        inorder(root.right, in);

    }
    public static Node createBalanceBST(Node root){
    if(root==null){
        return null;
    }
    ArrayList<Integer> in = new ArrayList<>();
    inorder(root,in);
    Node ans = createbst(in, 0, in.size()-1);
    return ans;

    }
    public static void preorder(Node root){
        if(root ==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        
        Node root = new Node(8);
         root.left = new Node(6);
         root.left.left = new Node(4);
         root.left.left.left= new Node(3);
         root.right = new Node(10);
         root.right.right = new Node(11);
         root.right.right.right = new Node(12);
         preorder(root);
         System.out.println();
         Node bst = createBalanceBST(root);
         preorder(bst);
    }
}
