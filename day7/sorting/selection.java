public class selection {
    public static void selection(int arr[]){
        int min =Integer.MAX_VALUE;
        for(int i = 0 ;i<arr.length-1;i++){
            int minpos = i;//consider out 1st potiotion is min
            for(int j = i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){//checking if other value is min then storing the index 
                    minpos=j;
                }
               
                }
                int temp =arr[minpos];
                arr[minpos]=arr[i];
                arr[i]=temp;
            }
            for(int i =0;i<arr.length;i++){
                System.out.print(arr[i]);
            }
        }
        public static void main(String[] args) {
            int arr[]={1,4,3,2,0};
            selection(arr+" ");
        }
    }

