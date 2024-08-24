public class practise1 {
    public static void printpos(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        //kam
        if(arr[i]==key){
            System.out.println(i+" ");

        }
        printpos(arr,key,i+1);
    }

    public static void main (String args[]){
        int arr[]={2,3,2,4,5,6,2,3,4,2};
        int key =2;
        printpos(arr,key,0);
    }
}
