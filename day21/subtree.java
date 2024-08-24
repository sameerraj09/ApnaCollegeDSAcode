public class subtree {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.right=null;
            this.left = null;
        }
    }
    //isme root ke baad dekh rahe hai identical hai ki nahi
   public static boolean isidentical(Node root,Node subroot){
    if(root==null &&subroot==null){
        return true;
    }
    else if(root==null || subroot==null || root.data!=subroot.data){ //agar koi ek null hogaya
        return false;
    }
    if(!isidentical(root.left, subroot.left)){ //agar leftsubtree nahi hai to
        return false;
    }
    if(!isidentical(root.right, subroot.right)){ //agar rigth subtree identical nahi hai to 
        return false;
    }
return true;   //agar upar wale koi sahi nahi hue to
   }
   //isme bass root ki value check kar rahe hai
    public static boolean subtree(Node root,Node subroot){ //subroot ke root node ki value check kar rahe hai mai root me hia ki nahi
        if(root==null){
            return false; //agar kahi nahi mila to false
        }
        if(root.data==subroot.data){
            if(isidentical(root,subroot)){ //agar mil gaya to identical ko call karunga
                return true;
            }
        }

        return subtree(root.left, subroot) ||subtree(root.right, subroot);    
        //left subtree me check karunga          //right subtree me check karunga
    }
    public static void main(String[] args) {
        //main tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //subroot
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        System.out.println(subtree(root, subroot));
    }
}
