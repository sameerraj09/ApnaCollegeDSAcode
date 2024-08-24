import java.util.*;

public class accen {
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

    // public static class BinaryTree {
    //     static int indx = -1;

    //     public static Node create(int nodes[]) {
    //         indx++;
    //         if (nodes[indx] == -1) {
    //             return null;
    //         }
    //         Node newnode = new Node(nodes[indx]);
    //         newnode.left = create(nodes);
    //         newnode.right = create(nodes);
    //         return newnode;
    //     }
    // }
public static void preorder(Node root)
{
    if(root ==null){
        return ;

    }
    System.out.print(root.data+" ");
    preorder(root.left);
      preorder(root.right);
   
  
    //System.out.println();
}  
public static void inorder(Node root)
{
    if(root ==null){
        return ;

    }
    
    inorder(root.left);
    System.out.print(root.data+" ");
      inorder(root.right);
}  
public static void postorder(Node root)
{
    if(root ==null){
        return ;

    }
    
    postorder(root.left);
      postorder(root.right);
      System.out.print(root.data+" ");
}  
public static int height(Node root){
if(root==null){
    return 0;
}
int lh=height(root.left);

int rh = height(root.right);
return Math.max(lh, rh)+1;
}
public static int count(Node root){
    if(root == null){
        return 0;
    }
    int leftcount = count(root.left);
    int rightcount = count(root.right);
    return leftcount + rightcount + 1;
}

public static int sum(Node root){
    if(root ==null){
        return 0;
    }
    int rightsum =sum(root.right);
    int leftsum=sum(root.left);
    return root.data+rightsum+leftsum;
}
 public static void levelorder(Node root){
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
        Node currNode = q.remove();
        if(currNode==null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            System.out.print(currNode.data+" ");
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
    }
 }
 public static int diameter(Node root){
    if(root==null){
        return 0;
    }
    int leftdiam = diameter(root.left);
    int rightdiam = diameter(root.right);
    int leftheight = height(root.left);
    int rightheight = height(root.right);
    //int rightdiam = diameter(root.right);
    int shelfdiam = leftheight+rightheight  +1;
    return Math.max(shelfdiam,Math.max(rightdiam, leftdiam));
 }

//   public static void print(Node root) {
//         if (root == null) {
//             return;
//         }
        
//         System.out.print(root.data+" ");
//         print(root.left);
//         print(root.right);
//     }

    public static void main(String[] args) {

            /*
             1
            /  \
           2    3
          / \   / \
         4   5 6   7

               */

       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left=new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);
       
        // preorder(root);
        // System.out.println();
        // inorder(root);
        // System.out.println();
        // postorder(root);
        // System.out.println();
        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sum(root));
        // levelorder(root);
        System.out.println(diameter(root));
    }
}
