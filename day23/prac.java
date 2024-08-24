public class prac {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node createNode(Node root, int data) {
        if (root == null) { // Correct
            return new Node(data);
        }
        if (root.data > data) { // Correct
            root.left = createNode(root.left, data);
        } else if (root.data < data) { // Correct
            root.right = createNode(root.right, data);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    // search
    public static boolean search(Node root, int key) {
        if (root == null) return false; // Correct
        if (root.data == key) return true; // Correct
        if (root.data > key) { // Correct
            return search(root.left, key); // Must return the result of recursive call
        }
        return search(root.right, key); // Correct
    }

    // delete
    public static Node delete(Node root, int val) {
        if (root == null) return null; // Added check for null root
        if (root.data > val) {
            root.left = delete(root.left, val); // Correct
        } else if (root.data < val) {
            root.right = delete(root.right, val); // Correct
        } else {
            // no child
            if (root.left == null && root.right == null) { // Correct
                return null;
            }
            // one child
            if (root.left == null) {
                return root.right; // Correct
            } else if (root.right == null) {
                return root.left; // Correct
            } else {
                // two children
                Node IS = findis(root.right); // Correct
                root.data = IS.data; // Correct
                root.right = delete(root.right, IS.data); // Correct
            }
        }
        return root; // Must return the root after processing
    }

    public static Node findis(Node root) { // Changed return type to Node
        while (root.left != null) { // Correct
            root = root.left; // Correct
        }
        return root; // Must return the node
    }
    public static void printrange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(k1<=root.data && root.data<=k2){
            printrange(root.left,k1);
            System.out.println(root.data);
            printinrange(root.right,k1,k2);
        }
        else if(root.data<k2){
            printinrange(root.right,k1,k2);
        }
        else{
            printinrange(root.left,k1,k2)
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 2, 8, 9}; // Corrected array declaration
        Node root = null; // Initialize root
        for (int i = 0; i < arr.length; i++) {
            root = createNode(root, arr[i]); // Correct function call
        }

        System.out.println("Inorder traversal:");
        inorder(root); // Correct inorder call
        boolean result = search(root, 4); // Correct search call
        System.out.println("Search for 4: " + result); // Print result
        root = delete(root, 4); // Must update root after deletion
        System.out.println("Inorder traversal after deleting 4:");
        inorder(root); // Correct inorder call
        printinrange(root,4,9);
    }
}
