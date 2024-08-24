public class kadanes {
    public static void maxsum(int arr[]) {
        int maxsum=Integer.MIN_VALUE;
        int cs=0;
       
        for(int i=0;i<arr.length;i++){
            if(cs<0){
                cs=0;
                
            }
            else{
                cs+=arr[i];
            }
            maxsumas =Math.max(maxsum, cs);
        }
       System.out.println("our max subarray sum is "+maxsum); 
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,5,-3};
        maxsum(arr);
    }
}
