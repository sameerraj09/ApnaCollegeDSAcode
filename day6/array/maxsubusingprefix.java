public class maxsubusingprefix {
    public static void maxsubarray(int arr[]){
        int currsum =0;
        int maxsum =Integer.MIN_VALUE;
        int prefix[] =new int[arr.length];
        prefix[0]=arr[0];//assign oth index
        for(int i =1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];  //adding the element till ith and store in ith position of prerfix
        }
        for(int i =0;i<arr.length;i++){
            int start=i;//finding start
        
        for(int j =i;j<arr.length;j++){
            int end = j;//finding the end
            currsum= start == 0? prefix[end] :prefix[end]-prefix[start-1];//if start =0;
            if(maxsum<currsum){
                maxsum=currsum;  //checking the curr sum to max sum
            }
        }
    }
    System.out.println("maxsum = "+maxsum);//printing the max sum
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxsubarray(arr);
    }
}
