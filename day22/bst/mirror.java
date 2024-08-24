public class mirror {

    public static class Node{
        int data;
        Node left;
        Node right;
    
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right  = null;
    }
    }

    
public static Node mirror(Node root){
    if(root==null){
        return null;
    }
    Node leftsubtree = mirror(root.left);
    Node rightsubtree = mirror(root.right);
    root.left = rightsubtree;
    root.right = leftsubtree;
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

public static void main(String[] args) {
    int arr[]={8,5,3,1,4,6,10,11,14};
    Node root   =null;
    for(int i = 0;i<arr.length;i++){
       root= createtree(root, arr[i]);
    }
  inorder(root);
   preorder(root);
 //  mirror(root);
   // preorder(root);

    boolean result = search(root, 10);
  //  System.out.println(result);
 // delete(root, 1);
boolean res = search(root, 1);
//System.out.println(res);
//printinrange(root, 5, 12);
ArrayList<Integer> a = new ArrayList<>();
//printpath(root, a);
boolean res1 = validate(root);
System.out.println(res1);
}
}


