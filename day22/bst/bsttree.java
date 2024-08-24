import java.util.ArrayList;
import java.util.List;

public class bsttree {
    public static class Node{
        int data;
        Node left;
        Node right;
    
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right  = null;
    }
    }

    //create
    public static Node createtree(Node root,int val){
        if(root==null){
            Node newNode = new Node(val);
            return newNode;
        }
        if(root.data>val){
            root.left = createtree(root.left, val);
        }
        if(root.data<val){
            root.right = createtree(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    //search
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(key>root.data){
            return search(root.right, key);
        }
        if(key<root.data){
           return search(root.left,key);
        }
        return false;
    }

    //delete
    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left = delete(root.left,val);
        }
        if(root.data<val){
            root.right = delete(root.right,val);
        }
        //we are at the node which we want to delete
        else{  
             //no child just remove it and point the parent to nulll
            if(root.left ==null && root.right == null){
             
                      return  null;
            }
            //case 2  one child  //point parent to the child of node which is going to delete
             if(root.right ==null){
                return root.left;
             }
             else if(root.left ==null){
                return root.right;
             }
             //case 3 two child
             //find insuccesoor
             // remove data of root with insucessor data (leftmost node of right subtree)
             //delete the IS with the above two rule 
             Node IS =findinordersuccessor(root.right);
             root.data = IS.data;
             root.right=delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findinordersuccessor(Node root){
       while(root.left!=null){
        root=root.left;
       }
       return root;
    }


    //print range
    public static void printinrange(Node root,int k1,int k2){
        //base case
        if(root==null){
            return;
        }
        //print in range of the no 
        //inorder wala pattern follow karna hai kyokin hamko value ascending order me chaihiye pehle left for print fir right
      if(root.data>=k1 &&root.data<=k2){
         printinrange(root.left, k1, k2);
         System.out.println(root.data);
         printinrange(root.right, k1, k2);
      }
      //agar root ka data k2 se bada hao to right side me sab value limit ke bahar jayegi isliye left  me jayenge 
      else if(root.data>k2){
        printinrange(root.left, k1, k2);
      }
    //agar root ki val k1 se v chota hai to left me jane ka koi fayda nahi hai right me jayenge
      else{
        printinrange(root.right, k1, k2);
      }
    }

    //print path
    public static void printpath(Node root,ArrayList<Integer> path){
        if(root==null){
            return ;
        }
        path.add(root.data); //kaam
        if(root.left==null &&root.right==null){
            print(path);    //base case
        }
        printpath(root.left, path);   //recursion
        printpath(root.right, path);
        path.remove(path.size()-1);

    }
    public static void print(ArrayList<Integer> a){
        for(int i =0;i<a.size();i++){
           System.out.print( a.get(i) +"-->");
        }
        System.out.println("null");
    }
//validata
    public static boolean validate(Node root){
        List<Integer> in = new ArrayList<>();
        inorder1(in,root);
        for(int i =1;i<in.size();i++){
             if(in.get(i-1)>in.get(i)){
                return false;
                
             }
             
        }
        return true;
    }
        public static void inorder1(List<Integer> inorder,Node root){
                if(root==null){
                    return;
                }
                inorder1(inorder,root.left);
                inorder.add(root.data);
                inorder1(inorder,root.right);


        }

public static Node mirror(Node root){
    if(root==null){
        return null;
    }
    Node leftsubtree = mirror(root.left);
    Node rightsubtree = mirror(root.right);
    root.left = rightsubtree;
    root.right = leftsubtree;
    return root;
}   
public static void preorder(Node root){
    if(root==null){
        return ;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}

public static void main(String[] args) {
    int arr[]={8,5,3,1,4,6,10,11,14};
    Node root   =null;
    for(int i = 0;i<arr.length;i++){
       root= createtree(root, arr[i]);
    }
  inorder(root);
   preorder(root);
 //  mirror(root);
   // preorder(root);

    boolean result = search(root, 10);
  //  System.out.println(result);
 // delete(root, 1);
boolean res = search(root, 1);
//System.out.println(res);
//printinrange(root, 5, 12);
ArrayList<Integer> a = new ArrayList<>();
//printpath(root, a);
boolean res1 = validate(root);
System.out.println(res1);
}
}
