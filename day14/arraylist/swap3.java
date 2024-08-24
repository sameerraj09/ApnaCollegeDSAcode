import java.util.ArrayList;
import java.util.Scanner;
public class swap3 { 
    public static void swap(ArrayList<Integer> list,int indx1,int indx2){
        int temp  = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2,temp);
        System.out.println(list);
    }
        public static void main(String[] args) {
            ArrayList<Integer> list= new ArrayList<>();
           list.add(0);
           list.add(2);
           list.add(4);
           list.add(5);
    System.out.println(list);
    System.out.println("after swapping");
        int idx1 = 2;
        int idx2  =3;
        swap(list,idx1,idx2);
    }
    }
     

