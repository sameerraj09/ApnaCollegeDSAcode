import java.util.*;
public class tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.right= null;
            this.left = null;
        }

    }
    public static  levelorder(Node root){
    List<List<Integer>> result= new ArrayList<>();
    if(root==null){
        return result;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        int size = q.size();
        List<Integer> temp= new ArrayList<>();
        for(int i = 0 ;i<size;i++){
            Node curr = q.remove();
            temp.add(curr.data);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        result.add(temp);
    }
    return result;    
}      
      
    


    public static void main(String[] args) {
        Node root  = new Node(1);
        root.left  = new Node(2);
        root.right  = new Node(3);
        root.left.left  = new Node(4);
        root.left.right  = new Node(5);
        root.right.left  = new Node(6);
        root.right.right  = new Node(7);
        List<List<Integer>> result = new ArrayList<>();
        result  = levelorder(root);
        System.out.println(result);
    }
}
