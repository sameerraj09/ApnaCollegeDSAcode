import java.util.*;
public class binary {
    public static int binary(int arr[],int key){
        int end =arr.length-1;
        int start = 0;
        while(start<=end){
            int mid = (end+start)/2;
if(arr[mid]==key){
    return mid;
}
if(arr[mid]<key){
start = mid+1;
}
else{
    end = mid-1;
}
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
      int result =   binary(arr,2);
      if(result ==-1){
        System.out.println("key doesnot exist");
      }
      else{
        System.out.println("key exist at position "+result);
      }
    }
}
