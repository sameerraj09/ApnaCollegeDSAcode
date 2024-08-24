public class rotatearr2 {
    public static int rotate(int arr[],int target) {
        int start = 0;
        int end  =arr.length-1;
        while(start<=end){
int mid =(start+end)/2;
if(target==arr[mid]){
return mid;
}
if(arr[mid]<target){
    start = mid+1;
}
else{
    end = mid-1;
}
        }
        return -1;
    
    }

    //t this point we know that the target is there or not 
    public static void main(String[] args) {
       int arr[]={1,3,4,5,6,9};
       int result = rotate(arr, 4);
       System.out.println("no is present at "+result+" index"); 
    }
    
}
