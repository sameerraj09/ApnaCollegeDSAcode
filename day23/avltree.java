public class avltree {
    public static class Node {
        int data, height; // for finding balancing factor
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static int height(Node root) {
        if (root == null) return 0;
        return root.height;
    }

    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node t2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = t2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node t2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = t2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // balance factor function LH-RH
    public static int getbalaceFactor(Node root) {
        if (root == null) return 0;
        return height(root.left) - height(root.right);
    }

    public static Node insert(Node root, int key) {
        if (root == null) return new Node(key);
        // same rule like BST
        else if (key < root.data) root.left = insert(root.left, key);
        else if (key > root.data) root.right = insert(root.right, key);
        else return root;
        // update height
        root.height = 1 + Math.max(height(root.left), height(root.right));
        // get root's balance factor
        int bf = getbalaceFactor(root);
        // LL CASE
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }
        // right right case going into right
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }
        // left right case
        if (bf > 1 && key > root.left.data) {
            // first left rotate on 2 elements
            root.left = leftRotate(root.left); // only on 2 elements
            return rightRotate(root);
        }
        // right left case key is added into right side
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root; // return if AVL is balanced
    }
  public static void preorder(Node root){
    if(root==null) return ;
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
  } 
    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        System.out.println("AVL tree created.");
        preorder(root);
    }
}
