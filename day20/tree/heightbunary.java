public class heightbunary {
    
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

    // Method to calculate height of binary tree
    public static int height(Node root) {
        if (root == null) {
            return 0; // Return 0 if root is null
        }

        // Calculate height of left subtree
        int lh = height(root.left);

        // Calculate height of right subtree
        int rh = height(root.right);

        // Return maximum height of left or right subtree plus 1 for current node
        return Math.max(lh, rh) + 1;
    }
    public static int count(Node root) {
        if (root == null) {
            return 0; // Return 0 if root is null
        }

        // Calculate node of left subtree
        int lcount = count(root.left);

        // Calculate node of right subtree
        int rcount = count(root.right);

        // Return sum of count of left tree and right tree and 1 for current node
        return (lcount+rcount) + 1;
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

        System.out.println(height(root)); // Output should be 3
        System.out.println(count(root));
    }
}
