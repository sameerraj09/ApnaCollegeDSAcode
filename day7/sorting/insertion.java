public class insertion {
    public static void insertion(int arr[]){
        for(int  i = 1;i<arr.length;i++){
            int current = arr[i];
            int prev = i-1;
            //finding the correct positon to insert 
       while(prev>=0 && arr[prev]>current){
         arr[prev+1]=arr[prev];
         prev--;
       }     
       arr[prev+1]=current;
     
    }
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
public static void main(String[] args) {
    int  arr[]={1,4,2,4,0};
    insertion(arr);
}
}