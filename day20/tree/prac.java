import java.util.*;

public class prac {
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
    static class BinaryTree{
        static int indx = -1;
        public static Node createTree(int []nodes){
            indx++;
            if(nodes[indx]==-1){
                 return  null;
            }
            Node node = new Node(nodes[indx]);
            node.left = createTree(nodes);
            node.right  =createTree(nodes);
            return node;
        }
        public static int count (Node root){
            if(root==null){
                return  0;
            }
            int lcount = count(root.left);
            int rcount = count(root.right);
            return Math.max(lcount, rcount) +1;
        }
        public static int totalnode(Node root){
            if(root==null){
                return 0;
            }
            int lcount =  totalnode(root.left);
            int rcount =  totalnode(root.right);
            return lcount +rcount +1;
        }
        public static int val(Node root){
            if(root==null){
                return 0;
        }
        int lval = val(root.left);
        int rval = val(root.left);
        return root.data+lval+rval;
        }

        public static int height (Node root){
            if(root==null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh)+1;
        }
    public static class info{
        int ht;
        int diam;
        public info(int diam,int ht){
            this.ht = ht;
            this.diam = diam;
        }
    }
        public static info diameter(Node root){
            if(root==null){
                return new info(0,0);
            }
            // int leftdiameter = diameter(root.left);
            // int leftht = height(root.left);
            // int rightdiamrter=diameter(root.right);
            // int rightht = height(root.right);
            // int shelfdiam = leftht+rightht+1;
            info left = diameter(root.left);
            info right = diameter(root.right);
           int diam =Math.max(Math.max(right.diam,left.diam),left.ht+right.ht+1);
           int ht = Math.max(left.ht, right.ht)+1;
           return new info(diam,ht);
        }

        public static boolean isidentical(Node root,Node subroot){
            if(root==null  &&subroot==null){
                return true;
            }
            else if(root==null || subroot==null|| root.data!=subroot.data){
                return false;
            }
            if(!isidentical(root.left, subroot.left)){
                return false;
            }
            if(!isidentical(root.right, subroot.left)){
                return false;
            }
            return true;
        }
        public static boolean subtree(Node root,Node subroot){
            if(root.data==subrroot.data){
                if(!isidentical(root, subroot)){
                    return true;
                }

            }
            return subtree(root.left, subroot) || subtree(root.right, subroot);
        }
    }
    

        public static List<List<Integer>> levelorder(Node root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) {
                return result;
            }

            Queue<Node> q1 = new LinkedList<>();
            q1.add(root);

            while (!q1.isEmpty()) {
                int size = q1.size();
                List<Integer> curr1 = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    Node curr = q1.remove();
                    curr1.add(curr.data);
                    if (curr.left != null) {
                        q1.add(curr.left);
                    }
                    if (curr.right != null) {
                        q1.add(curr.right);
                    }
                }
                result.add(curr1);
            }

            return result;
        }
   

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.createTree(nodes);

        /*
         1
        /  \
       2    3
      / \    \
     4   5    6
        */

        // List<List<Integer>> levels = tree.levelorder(root);
        // for (List<Integer> level : levels) {
        //     System.out.println(level);
        // }
        int height = tree.height(root);
        System.out.println(height);
        int count  =  tree.count(root);
        System.out.println(count);
        int val = tree.val(root);
        System.out.println(val);
        int diam = tree.diameter(root).diam;
        System.out.println(diam);
    }
}
