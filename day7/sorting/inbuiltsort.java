import java.util.*;
import java.util.Collection;
public class inbuiltsort {
    public static void main(String[] args) {
        Integer arr[]={1,2,5,7,8,9,2};
        // Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
      
    }
}
