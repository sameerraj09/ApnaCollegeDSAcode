public class counting {
    public static void count(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int  i =0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] =new int[largest+1];
        for(int  i=0;i<arr.length;i++){ //iterate over orignal array
         count[arr[i]]++;//if the elment is present then increase the count
        }
        //sorting iterate over count array
        int j =0;
        for(int i =0;i<count.length;i++){
while(count[i]>0){
    arr[j]=i;//PUTTING THE VALUE IN ARRAY 
    count[i]--;//DECREASING THE COUNT VALUE
    j++;//INCREASING THE INDEX OF ARR
}
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,8,9,5,4,2,10};
        count(arr);
    }
}
