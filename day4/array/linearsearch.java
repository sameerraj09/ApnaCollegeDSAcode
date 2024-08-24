import java.util.*;
public class linearsearch {
    public static int linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
            
                return -1;
            }
            public static void main(String[] args) {
                int arr[]={1,2,3,4,5,6};
                int key = 4;
             int result =    linear(arr, key);
             if(result ==-1){
                System.out.println("element not present ");
             }
             else{
                System.out.println("element is present at "+result+ "position");

             }
            }
        }

