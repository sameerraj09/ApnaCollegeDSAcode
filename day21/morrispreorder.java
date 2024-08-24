import java.util.ArrayList;
import java.util.List;
public class morrispreorder {
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

    public static List<Integer> morrisTraversal(Node root) {
        List<Integer> preorder = new ArrayList<>();
        Node curr = root;

        while (curr != null) {
            if (curr.left == null) {
                preorder.add(curr.data);
                curr = curr.right;
            } else {
                Node prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = curr; // make thread
                    preorder.add(curr.data); // add to queue
                    curr = curr.left; // go to the left side
                } else { // already there is thread
                    prev.right = null; // remove thread
                    curr = curr.right; // go to the right side
                }
                
            }
        }
        return preorder;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> result = morrisTraversal(root);
        System.out.println(result); // Expected output: [1, 2, 4, 5, 3, 6, 7]
    }
}

