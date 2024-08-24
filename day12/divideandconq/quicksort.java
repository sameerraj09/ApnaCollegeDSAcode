public class quicksort {
    public static void quicksort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //last element
        int pidx = partition(arr,si,ei);
        quicksort(arr,si,pidx-1);//left
       quicksort(arr,pidx+1,ei);//right
    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];//last elemnt as pivot
        int i =si-1;//to make place for the element smaller than pivot
        for(int j = si;j<ei;j++){
            if(arr[j]<pivot){//jagah bananana hoga
            i++;
            //swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            }
        }
    i++;
    int temp  = pivot;//making pivot at the orignal place
    arr[ei]=arr[i];
    arr[i]=temp;  
    return i;
    }
    public static void printarr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,6,5,4,3,2};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
}
