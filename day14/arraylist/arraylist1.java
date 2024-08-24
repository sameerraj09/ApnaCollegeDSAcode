import java.util.*;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
     //adding the value in list1 ass opern(o(1))
        list1.add(1);
       list1.add(2);
       list1.add(3);
       list1.add(4);
       System.out.println(list1);


       //get opern O(1)
     int element=  list1.get(1);
     System.out.println(element);

     //remove opern o(n)
     list1.remove(2);//removing elemnent at 2nd index
     System.out.println(list1);

     //set opern o(n)

     list1.set(2, 10);//at 2nd index placing 10
     System.out.println(list1);
     //contain opern (0(n))
    System.out.println(list1.contains(10)); //return true if there is element in the list
    System.out.println(list1.contains(11));


    //adding some element at particular position
    list1.add(1,11);
    System.out.println(list1);

//printing the arraylist
   for(int i =0;i<list1.size();i++){
    System.out.print(list1.get(i)+" ");
   }
   System.out.println();
   //reverse the arraylist
   for(int i =list1.size()-1;i>=0;i--){
    System.out.print(list1.get(i)+" ");
   }
}
}
