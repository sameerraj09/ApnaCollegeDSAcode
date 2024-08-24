public class sortedarr {
    public static boolean arrsort(int arr[],int i){
      if(i==arr.length-1){
        return true;
      }
        if(arr[i]>arr[i+1]){
        return false;
      }
      return arrsort(arr,i+1);
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,10,4,5,6};
        System.out.println(arrsort(arr, 0));
    }
}
