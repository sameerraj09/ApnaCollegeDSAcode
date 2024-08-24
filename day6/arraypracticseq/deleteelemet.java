public class deleteelemet {
    public static void delete(int arr[],int element){
        int deleteindex=-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==element){
                deleteindex=i;
            }
            while(deleteindex!=-1){
                int newarray[]=new int[arr.length-1];
                System.arraycopy(arr,0,newarray,0,deleteindex);
                System.arraycopy(arr, deleteindex+1, newarray, deleteindex, arr.length-deleteindex-1);
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
       int [] newarr =  delete(arr, 3);
       for(int j =0;j<newarray.length;i++){
        System.out.print(newarray[j]+" ");
    }
    }
}
