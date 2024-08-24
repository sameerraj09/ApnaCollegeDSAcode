public class pair {
    public static void printpair(int arr[]){
    //   int i =0;
    //   while(i<arr.length){
    //     int j = i+1;
    //     while(j<arr.length){
    //         System.out.print("("+arr[i]+" ");
    //         System.out.print(arr[j]+")");
    //         j++;  
    //     }
    //     i++;
  
    //   }
    for(int i =0;i<arr.length;i++){
        int curr=arr[i];
        for(int j = i+1;j<arr.length;j++){
     System.out.print("("+curr+","+arr[j]+")");
        }
        System.out.println();
    }

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printpair(arr);
    }
}
