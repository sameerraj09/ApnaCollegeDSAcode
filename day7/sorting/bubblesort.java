public class bubblesort {
    /**
     * @param arr
     */
    public static void bubblesort(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<length-1-i;j++){//0 to n-2 for qst iterate
                if(arr[j]>arr[j+1]){
                    if(arr[j]>arr[j+1]){
                                     int temp = arr[j];
                                     arr[j]=arr[j+1];
                                  arr[j+1]=temp;
                }
            }
        }
    }
        // for(int i =0;i<arr.length-1;i++){
        //     for(int j=i;j<arr.length;j++){
        //         if(arr[i]>arr[j]){
        //             int temp = arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        
        // }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
            }
        }
  
    public static void main(String[] args) {
        int arr[]={18,9,7,2,1};
        bubblesort(arr);
    }
}
