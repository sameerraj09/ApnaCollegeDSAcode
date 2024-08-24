public class rainwater {
    public static void rainwater(int height[]) {
        int leftmax[]=new int[height.length];
        int rightmax[]=new int[height.length];
        int n =height.length;
      
        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];
        for(int i =1;i<n;i++){ //creating the left array
        
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        for(int i =n-2;i>=0;i--){ //creating the left array
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trappedstore =0;
        for(int i =0;i<n;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
           trappedstore+=waterlevel-height[i];
        }

        System.out.println(trappedstore);
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        rainwater(height);
    }
   
}
