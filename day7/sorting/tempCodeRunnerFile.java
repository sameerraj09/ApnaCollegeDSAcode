public class bubblesort {
    public static void bubblesort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            for(int k=0;i<arr.length;i++){
                System.out.println(arr[k]);