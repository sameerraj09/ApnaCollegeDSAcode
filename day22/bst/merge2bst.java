import java.util.ArrayList;

public class merge2bst {
    public static class Node{
      int data;
      Node left;
      Node right;
      public Node(int data){
        this.data =data;
        this.left = null;
        this.right = null;
      }  

    }
    public static Node createBST(ArrayList<Integer> ans,int start ,int end){
      if(start>end){
        return null;
      }
    int mid = (start+end)/2;
    Node root  = new Node(ans.get(mid));
    root.left = createBST(ans, start, mid-1);
    root.right = createBST(ans,mid+1,end);
    return root;
    }
    public static void inorder(Node root,ArrayList<Integer> in){
      if(root==null){
        return ;
      }
      inorder(root.left, in);
      in.add(root.data);
      inorder(root.right, in);
    }
    public static Node merge(Node root1,Node root2){

      ArrayList<Integer> result1= new ArrayList<>();
      ArrayList<Integer> result2 = new ArrayList<>();
      inorder(root1, result1);
      inorder(root2, result2);
      
      int i =0;
      int j = 0;
      ArrayList<Integer> result = new ArrayList<>();
      while(i<result1.size() && j<result2.size()){
        if(result1.get(i)<result2.get(j)){
              result.add(result1.get(i));
              i++;
        }
        else{
          result.add(result2.get(j));
          j++;
        }
      }
      while(i<result1.size()){
       result.add(result1.get(i));
       i++;
      }
      while(j<result2.size()){
        result.add(result2.get(j));
        j++;
       }
       Node root = createBST(result, 0, result.size()-1);
       return  root;
      
    }

  public static void main(String[] args) {
    Node root1 = new Node(4);
   root1.left = new Node(2);
   root1.right = new Node(8);
   Node root2 = new Node(5);
   root2.left = new Node(3);
   root2.right = new Node(7);
  Node root = merge(root1, root2);
  ArrayList<Integer> ans = new ArrayList<>();
  inorder(root, ans);
  for (int val : ans) {
    System.out.print(val + " ");
}
  }  
}
