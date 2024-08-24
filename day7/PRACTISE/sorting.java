public class sorting {
    // public static void count(int arr[]){
    //     int largest=Integer.MIN_VALUE;
    //     for(int i =0;i<arr.length;i++){
    //         largest = Math.max(largest,arr[i]);
    //     }
    //     int count[] =new int[largest+1];
    //     for(int i = 0;i<arr.length;i++){
    //         count[arr[i]]++;
    //     }
    //     int j =0;
    //     for(int i =0;i<count.length;i++){
          
    //         while(count[i]>0){
    //             arr[j]=i;
    //             count[i]--;
    //             j++;
    //         }
    //     }
    // }
    // public static void bubble(int arr[]){
    //     for(int turn = 0;turn<arr.length;turn++){
    //         for(int j =0;j<arr.length-turn-1;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp =arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //             }
    //         }
    //     }
    // }
    // public static void insertion(int arr[]){
    //     for(int i =1;i<arr.length;i++){
    //      int current = arr[i];
    //      int prev = i-1;
    //      while(prev>=0 && arr[prev]>current){
    //         arr[prev+1]=arr[prev];
    //         prev--;
    //      }
    //      arr[prev+1]=current;
    //     }
    // }
    // public static void print(int arr[]){
    //     for(int i =0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    public static void selection(int arr[]){
        for(int i =0;i<arr.length;i++){
int minpos =i;
for(int j = i+1;j<arr.length;i++){
if(arr[minpos]>arr[j]){
    minpos=j;
}
}
int temp = arr[minpos];
 arr[minpos] = arr[i];
 arr[j]=temp;

        }
    }
public static void main(String[] args) {
    int arr[]={1,9,8,5,3,2};
    //count(arr);
   // print(arr);
    //bubble(arr);
    //print(arr);
    //insertion(arr);
    //print(arr);
}
}
