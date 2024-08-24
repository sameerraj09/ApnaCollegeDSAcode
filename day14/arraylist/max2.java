import java.util.ArrayList;
import java.util.Scanner;

public class max2 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
       list.add(0);
       list.add(2);
       list.add(4);
       list.add(5);

       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       for(int i =0;i<list.size();i++){
        //   if(list.get(i)>max){
        //     max= list.get(i);
        //   }
        max= Math.max(max, list.get(i));
       }
       System.out.println(max);
}
}
