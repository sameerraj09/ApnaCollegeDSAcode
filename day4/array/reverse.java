public class reverse {
    public static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
for(int k = 0;k<arr.length;k++){
System.out.print(arr[k]+" ");
}
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println("before the swapping ");
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("after the swapping ");
        reverse(arr);
    }
}
