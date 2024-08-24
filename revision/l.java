import java.util.*;

public class l {
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

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node x = q.remove();
            if (x == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                System.out.print(x.data + " ");
                if (x.left != null) {
                    q.add(x.left);
                }
                if (x.right != null) {
                    q.add(x.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6);
        root.right.right = new Node(7); 
        
        levelorder(root);
    }
}
