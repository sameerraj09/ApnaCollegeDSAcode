import java.util.ArrayList;

public class sortedarrtobst {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right=null;
        }
    }
    public static Node createBST(int arr[],int start,int end){
    if(start>end){
        return null;
    }
    int mid   = (end-start)/2;
    Node root = new Node(mid);
    root.left = createBST(arr, start, mid-1);
    root.left = createBST(arr, mid+1, end);
    return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root,ArrayList<Integer> in){
       if(root==null){
        return ;
       }
       inorder(root.left, in);
       in.add(root.data);
       inorder(root.right, in);
    
}

    
    public static void main(String[] args) {
      int arr[] = {3,5,6,8,10,11,12};
      Node root = createBST(arr, 0, arr.length-1);
     //  preorder(root);
      
      
    }
}
