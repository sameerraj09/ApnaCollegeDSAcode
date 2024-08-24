public class subarray {
    public static void subarray(int arr[]){
        // int i =0;
        // while(i<=arr.length){
        //     int j = i+1;//FROM I I HAVE TO START PRINTING
        //    while(j<arr.length){
        //    int k = i;
        //     while(k<=j){
    
        //      System.out.print(arr[k]+" ");
        //      k++;
        //     }
        //     System.out.println();
        //     j++;
        // }
        // System.out.println();
        // i++;
        //    }  
           for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                for(int k =i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                   }
                   System.out.println();        
            }
           }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        subarray(arr);
    }
}
