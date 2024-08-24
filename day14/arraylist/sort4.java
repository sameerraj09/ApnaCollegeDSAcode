import java.util.*;
public class sort4 {
   

    public static void swap(ArrayList<Integer> list,int indx1,int indx2){
        int temp  = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2,temp);
        System.out.println(list);
    }
        public static void main(String[] args) {
            ArrayList<Integer> list= new ArrayList<>();
           list.add(0);
           list.add(8);
           list.add(4);
           list.add(9);
    System.out.println(list);
    Collections.sort(list);
    System.out.println("ascending order");
    System.out.println(list);
    Collections.sort(list,Collections.reverseOrder());
    System.out.println("descending order");
    System.out.println(list);
    }
    }
     
