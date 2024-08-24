public class diametertree { 
        // Define Node class
        static class Node {
            int data;
            Node left;
            Node right;
    
            Node(int data) { // Initialization
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
    
       
        public static int height(Node root) {
            if (root == null) {  //this root mean not the actual root at very level it is changing
                return 0; // Return 0 if root is null
            }
    
            // Calculate node of left subtree
            int leftheight = height(root.left); //for going down to left side
    
            // Calculate node of right subtree
            int rightheight = height(root.right);  //for going down to write 
    
            // Return sum of sum of left tree and right tree and root data
            return Math.max(leftheight,rightheight)+1;  //adding data of root to it(node value at particular level treated as root) at this place the actual value is added
        }
    public static int diameter(Node root){ //on^2
        if(root==null){
         return 0;   
        }
        int leftdiam = diameter(root.left);
        int leftHt = height(root.left);
        int righttHt = height(root.right);
        int rightdiam = diameter(root.right);

        int selfdiam = leftHt+righttHt+1;
        return Math.max(selfdiam,Math.max(rightdiam,leftdiam));
    }
    
       
        public static void main(String[] args) {
            /*
    
             1
           /   \
          2     3
         / \   /  \
        4   5 6    7
    
         */
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
    
            System.out.println(diameter(root));
        }
    }
    

