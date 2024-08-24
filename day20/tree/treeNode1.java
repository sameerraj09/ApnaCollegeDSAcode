import java.util.*;
public class treeNode1 {
    // pehle npde ki ek class banao
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) { // initialization
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int idx = -1;

        public static Node Buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) { // no need to create no child for this
                return null;
            }
            Node newNode = new Node(nodes[idx]);/// jo v idx pe data store hoga usko naya node bana lenge
            // iske baad uska left subtree aur for right subtree
            newNode.left = Buildtree(nodes);// function bana ke de dega left wala //equal to jorne ka kaam kar raja hai
            newNode.right = Buildtree(nodes);
            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return; // base case
            }
            // 3 rule
            System.out.println(root.data + " ");
            preorder(root.left);// aab left ko call kardo
            preorder(root.right);
        }

        public static void Inorder(Node root) {
            if (root == null) {
                return; // base case
            }
            // 3 rule
            preorder(root.left);// aab left ko call kardo
            System.out.println(root.data + " ");
            preorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return; // base case
            }
            // 3 rule
            preorder(root.right); //pehle right fir left for root
            preorder(root.left);// aab left ko call kardo
            System.out.println(root.data + " ");

        }
        public static void Levelorder(Node root) {
            if (root == null) {
                return; // base case
            }
            Queue<Node> q = new LinkedList<>();     //queue bana ke rakhna hoga       
             q.add(root);//pehle se root khood se add karna hoga
             q.add(null); //next line ke liye null add karna hoga
             while(!q.isEmpty()){ //jab tak queue khali nahi hoti
              Node currNode = q.remove();//do possiblity hai vurr node ka ya to null hoga ya koi value
              if(currNode==null){  //agar null hai to
                System.out.println();  //ek line print karo level deekhane ke liye 
                if(q.isEmpty()){   //agar khali hai to bahar aa jao
                    break;
                }
                else{
                    q.add(null);//agar khali nahi hua to null add kardo
                }
              }
              else{
                System.out.print(currNode.data+" ");//ya to koi value hai uska data print karo
                if(currNode.left!=null) q.add(currNode.left); //left ko check kar liya agar not null hai to add kar diya
                if(currNode.right!=null) q.add(currNode.right);
                
              }
             }


        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree tree = new Binarytree();
        Node root = tree.Buildtree(nodes);
        System.out.println(root.data);
        tree.preorder(root);
        tree.Levelorder(root);
    }
}
