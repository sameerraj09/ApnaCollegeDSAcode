public class sumnode {
   
    
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
    
       
        public static int sum(Node root) {
            if (root == null) {  //this root mean not the actual root at very level it is changing
                return 0; // Return 0 if root is null
            }
    
            // Calculate node of left subtree
            int leftsum = sum(root.left); //for going down to left side
    
            // Calculate node of right subtree
            int rightsum = sum(root.right);  //for going down to write 
    
            // Return sum of sum of left tree and right tree and root data
            return leftsum+rightsum+ root.data;  //adding data of root to it(node value at particular level treated as root)  //at this place the actual value is added
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
    
            System.out.println(sum(root));
        }
    }
    
