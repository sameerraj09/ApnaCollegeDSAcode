public class maxsubarray {
    public static void maxsub(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            int start = i;
       
            for(int j=i;j<arr.length;j++){
                int end =j;
                int currsum =0;
                for(int k = start;k<=end;k++){
                currsum+=arr[k];
                }
                if(currsum>maxsum){
                    maxsum =currsum;
                }
                System.out.println(currsum);  
            
            }
           

        }
        System.out.println("max sum ="+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,-3,3,5,6};
       maxsub(arr);
    }
}
