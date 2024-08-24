import java.util.*;
public class largest {
    public static void largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
           if(arr[i]>largest){
            largest = arr[i];
           }
           if(arr[i]<smallest){
            smallest=arr[i];
           }
        }
        System.out.println("largest value ="+largest);
        System.out.println("smallest value ="+smallest);
    }

public static void main(String[] args){
    int arr[]={1,2,3,4,54};
    largest(arr);
}
   

}
