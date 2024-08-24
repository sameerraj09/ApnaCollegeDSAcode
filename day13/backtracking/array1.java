public class array1 {
    public static void changearr(int arr[],int i,int val){
//base case
if(i==arr.length){
    printarr(arr);//when going up
    return;
}
//kaam
arr[i]=val;//assinging value during going up
changearr(arr, i+1, val+1);//calling recurision
arr[i]=arr[i]-2;//assinging value coming down by 2
    }
    public static void printarr(int arr[]){
        System.out.println("going up in call stack");
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int [5];
        changearr(arr, 0, 1);
        System.out.println("after coming down from call stack");
        printarr(arr);//after coming down 
    }
}
