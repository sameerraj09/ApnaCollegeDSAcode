public class rainwater {
    public static void watertapped(int height[]){
        int n =height.length;
        int totalwater=0;
        int maxleft[]=new int[n];
        int maxright[]=new int[n];
         maxleft[0]=height[0];
         maxright[n-1]=height[n-1];
        for(int i =1;i<n;i++){
            maxleft[i]=Math.max(height[i],maxleft[i-1]);
        }
        for(int i =n-2;i>=0;i--){
            maxright[i]=Math.max(height[i],maxright[i+1]);
        }
        for(int i =0;i<n;i++){
            int waterheight = Math.min(maxleft[i],maxright[i]);
            totalwater+=waterheight-height[i];
        }
        System.out.println(totalwater);
    }
    public static void main(String[] args){
        int arr[]={4,2,0,6,3,2,5};
        watertapped(arr);

    }
}
