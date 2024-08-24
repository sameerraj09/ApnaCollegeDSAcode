import java.util.*;
public class topview {
    
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
        static class info{
            Node node;
            int hd;
            public info(Node node,int hd){
                this.node = node;
                this.hd=hd;
            }
        }
        public static void topview(Node root){
            //level order
            Queue<info> q = new LinkedList<>(); //creating queue
            HashMap<Integer,Node> map =new HashMap<>(); //creating hashmap
            int min =0,max = 0; //creating min and max value to print the ans at last 
            q.add(new info(root,0)); //add zero for root horizontal distance
            q.add(null);
            while(!q.isEmpty()){ //null wali bakchodi
             info curr=q.remove();
             if(curr==null){ //agar curr ko nikal kar queue khali hai to to break kar do nahi to null add kardo agle level ke liye
                if(q.isEmpty()){ //khali ho gayi
                    break;
                }
                else{
                 
                    q.add(null);//agle level ke liye null add karod
                }
            
             }
             else{
                if(!map.containsKey(curr.hd)) {
                    //first time my hd is coming
                    map.put(curr.hd,curr.node);
                }
                
                //same process left child null nahi hai to add kardo
                if(curr.node.left!=null){
                    q.add(new info(curr.node.left,curr.hd-1));
                    min = Math.min(min,curr.hd-1); //left ka hd ban jayega curr ka hd ka -1
                }
              //adding the right part and putting the horizontal distance to it
                if(curr.node.right!=null){
                    q.add(new info(curr.node.right,curr.hd+1));
                    max= Math.max(max,curr.hd+1);
                }
             }
             
        }
        //printing the op
        for(int i =min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }


        }
        
        public static void main(String[] args) {
            Node root  = new Node(1);
            root.left  = new Node(2);
            root.right  = new Node(3);
            root.left.left  = new Node(4);
            root.left.right  = new Node(5);
            root.right.left  = new Node(6);
            root.right.right  = new Node(7);
            topview(root);
        }
    }
     

