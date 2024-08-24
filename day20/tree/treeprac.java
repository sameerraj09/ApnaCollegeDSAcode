public class treeprac {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
                 this.data = data;
                 this.left = null;
                 this.right= null;
        }
        }
        public static class Binarytree{
          static int indx =-1;
            public static Node createTree(int nodes[]){
            indx++;
            if(nodes[indx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left  = createTree(nodes);
            newNode.right  = createTree(nodes);
            return newNode;
            }
        }
        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
        public static void main(String[] args) {
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Binarytree tree= new Binarytree();
            Binarytree.indx =-1;
          Node root=  tree.createTree(nodes);
          preorder(root.left);
        }
    }

