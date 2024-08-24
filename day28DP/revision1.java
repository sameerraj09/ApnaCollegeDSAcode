public class revision1 {
    // 0 1 knapsack using recursion
    // base case
    // ip wt [] and val[]
    // knapsack wt
    public static int knapsack(int []val,int wt[],int W,int n){
        
        if(W==0 ||n==0){
            return 0;

        }
       
        if(wt[n-1]<=W){
            //include 
            int ans1 =val[n-1]+ knapsack(val, wt, W-wt[n-1], n-1);
            //exclude
            int ans2  = knapsack(val, wt, W, n-1);
            
            return Math.max(ans1, ans2);
        }
        else{
//exclude
return knapsack(val, wt, W, n-1);
        }       
    }

    public static int knapsack1(int[] val, int wt[], int W, int n, int[][] dp) {

        if (W == 0 || n == 0) {
            return 0;

        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {
            // include
            int ans1 = val[n - 1] + knapsack1(val, wt, W - wt[n - 1], n - 1,dp);
            // exclude
            int ans2 = knapsack1(val, wt, W, n - 1,dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            // exclude
            dp[n][W] = knapsack1(val, wt, W, n - 1,dp);
            return dp[n][W];
        }
    }
    public static int knapsack2(int val[],int wt[],int W,int dp[][],int n){
        // for(int i  = 0;i<dp.length;i++){
        //     for(int j = 0;j<dp[0].length;j++){

        //     }
        // }

        //tabulation
        //intialize for the base case
        //each cell has it's own alue
        for(int i = 0;i<dp.length;i++){
            dp[i][0]  =0;

        }
        for(int j = 0;j<n+1;j++){
            dp[0][j] = 0;
        }
        for(int i = 1;i<dp.length;i++){
            for(int j = 1;j<W+1;j++){
                int v  = val[i-1];
                int w = wt[i-1];
                if(j>=w){
                     int ans = Math.max(v+dp[i-1][j-w], dp[i-1][j]);
                     dp[i][j] = ans;
                }
                else{
                    int ans1 = dp[i-1][j];
                    dp[i][j] = ans1;
                }

            }
        }
        return dp[n][W];
    }
    public static int lcs(String s1,String s2,int n,int m,int dp[][]){
        if(dp[n][m]!=-1) return dp[n][m];
        if(s1.length()==0 || s2.length()==0) return 0;
        //tow case if we have same end val then increase by one
        if(s1.charAt(n-1)==s2.charAt(n-1))
       { int ans =  lcs(s1, s2,n-1,m-1)+1;
        dp[n][m] = ans;
       }
        else{
            //we have two case 
            int ans =  Math.max(lcs(s1,s2,n-1,m),lcs(s1, s2, n, m-1));
            dp[n][m] =ans;
            return dp[n][m];
        }
    }
    public static operation(String a,String b){
        int dp [][] =new int[a.length()+1][b.length()+1];
        for(int i = 0;i<a.length()+1;i++){
           //we have no item in so we have to add all element to it
           dp[i][0] = i;
        }
        for(int j = 0;j<b.length()+1;j++){
            dp[0][j] = j;//remove each element one by one

        }
        for(int i = 1;i<a.length()+1;i++){
            for(int j =1;j<b.length();j++){
                     if(a.charAt(i)==a.charAt(j)){
                        dp[i][j] = dp[i-1][j-1]+1;
                     }
                     else{
                        // 3 opern
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1],dp[i-1][j-1]);
                     }
            }
        }
    }

    public static boolean amtch(String text,String pattern){
             int dp[][] =new int[text.length()+1][pattern.length()+1];
             dp[0][0] = true; // if there will be no pattern and no character then it will be true
             for(int j = 0;j<pattern.length()+1;j++){
                if(pattern.charAt(j-1)=='*') dp[0][j] = dp[0][j-1]; //if we have * mean we can match it with null also

             }
             //now real logic
             for(int i  = 1;i<text.length()+1;i++){
                for(int j = 1;j<pattern.length()+1;j++){
                    if(text.charAt(i-1)==b.charAt(j-1) || pattern.charAt(j-1)=='?'){
                        dp[i][j]= dp[i-1][j-1];
                    }
                    else if(pattern.charAt(j)=='*'){
                        // two case ignore the element or ignore the *
                        dp[i][j] = dp[i-1][j]   
                    }
                }
             }
    }
   

    public static void main(String[] args) {
      
        
        int wt[] = { 2, 5, 1, 3, 4 };
        int val[] = { 15, 14, 10, 45, 30 };
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) { // initilize the fist row and coulmn as 0 when we dont have the
                                                     // item then the val = 0 and we dont have wt then also we can't get
                                                     // any value

                dp[i][j] = -1;
            }
        }
            // this dp[i][j] indicate that what are the max value we can store using the i
            // item for j wt
        System.out.println(knapsack(val, wt, W, wt.length));
        System.out.println(knapsack1(val, wt, W, wt.length, dp));
        System.out.println(knapsack2(val, wt, W, dp, wt.length));
    }
}
