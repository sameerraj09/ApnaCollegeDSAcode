import java.util.ArrayList;

public class largestbst {
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

    public static void inorder(Node root, ArrayList<Integer> in) {
        if (root == null) {
            return;
        }
        inorder(root.left, in);
        in.add(root.data);
        inorder(root.right, in);
    }

    public static boolean checkInorder(ArrayList<Integer> inorder) {
        for (int i = 1; i < inorder.size(); i++) {
            if (inorder.get(i - 1) >= inorder.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static int largestBst(Node root) {
        if (root == null) {
            return 0;
        }

        ArrayList<Integer> inorderList = new ArrayList<>();
        inorder(root, inorderList);

        if (checkInorder(inorderList)) {
            return inorderList.size();
        }

        return Math.max(largestBst(root.left), largestBst(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(40);
        root.right = new Node(60);
        root.right.left = new Node(55);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);

        int result = largestBst(root);
        System.out.println("Size of the largest BST is: " + result);
    }
}
