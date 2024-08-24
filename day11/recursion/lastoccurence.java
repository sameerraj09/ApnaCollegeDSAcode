public class lastoccurence {
    public static int lastoccurence(int arr[],int key,int i){
        if(i<0){
            return -1;
        }
        if(key ==arr[i]){
            return i;
        }
        return lastoccurence(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,2,12,2,6};
        int n =arr.length-1;
        System.out.println(lastoccurence(arr, 2,n));
    }
}
