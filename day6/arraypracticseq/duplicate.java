//brutforce
public class duplicate {
  public static boolean duplicate(int arr[]) {
    for(int i =0;i<arr.length;i++){//fixing the 1st no 
     for(int j = i+1;j<arr.length;j++){//checking all the elment 
if(arr[i]==arr[j]){
    return true;
}
     }
    }
    return false;
  }  

public static void main(String[] args) {
    int arr[]={1,3,2,4};
    boolean result = duplicate(arr);
    System.out.println(result);
  }
}

