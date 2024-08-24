//fibonaci

import java.lang.reflect.Array;
import java.util.Arrays;

public class fibonaci{  
//   public static int fib(int n){
//         if(n==0 || n==1){
//             return n;
//         }
//         return fib(n-1)+fib(n-2);
//     }

//     //memoization
//     public static int fib(int n,int[] dp){
//         if(n==0||n==1){
//             return 1;
//         }
//         if(dp[n] != -1){
//           return dp[n];
//         }
//         int result = fib(n-1)+fib(n-2);
//         dp[n] = result;
//         return dp[n];
//     }
//     public static int fib2(int n){
//         int dp[] = new int[n+1];
//         dp[0] = 0;
//         dp[1] = 1;
//         for(int i  = 2;i<=n;i++){
//             dp[i] = dp[i-1]+dp[i-2];   
//         }
//        return dp[n];
//     }

    //0 1 knapsack
    public static int knapsack(int val[],int dp[][],int wt[],int W,int n){
        if(n==0 ||W==0){
            return 0;
        }
        //dp[i][j] = till i the elment and j value what is the max profit
        if(dp[n][W]!=-1) return dp[n][W];
        // if(dp[n][W]!=-1){
        //     return dp[n][W];
        // }
        if(wt[n-1]<=W){
            //case 1 
            int ans1 =val[n-1]+ knapsack(val,dp,wt, W-wt[n-1], n-1);
            //exclude
            int ans2 = knapsack(val, dp,wt, W, n-1);
            int ans = Math.max(ans1, ans2);
            dp[n][W] = ans;
            // dp[n][W] = ans;
            // return dp[n][W];
            return ans;
        }
        else{
           int ans =knapsack(val,dp,wt, W, n-1);
           dp[n][W] = ans;
                    return dp[n][W];
        //   dp[n] = ans;
        //   return dp[n][W];
         }

    }
    public static int knapsack1(int n,int W,int wt[],int val[]){
        int dp[][] = new int[n+1][W+1];
        for(int i = 0;i<n+1;i++){
            dp[i][0] = 0;
        }
        for(int j = 0;j<W+1;j++){
            dp[0][j] = 0;
        }
        for(int i= 1;i<n+1;i++){
            for(int j =1;j<W+1;j++){
                
                     if(wt[i-1]<=j){
                        //include 
                        dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
                     }
                     else{
                        dp[i][j] = dp[i-1][j];
                     }
            }
        }
        for(int i = 0;i<n+1;i++){
            for(int j = 0;j<W+1;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][W];
    }
    public static boolean target(int nums[],int sum){
        boolean dp [] [] = new boolean[nums.length+1][sum+1];
        //dp initialization 
        for(int i =0;i<dp.length;i++){
            dp[i][0] = true;
        }
        //other base case will aitomaitcally cal
        for(int i = 1;i<nums.length+1;i++){
            for(int j = 1;j<sum+1;j++){
                int curr = nums[i-1];
                if(curr<=j && dp[i-1][j - curr]){
                   dp[i][j] = true;
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[nums.length][sum];
    }
   public static int knap(int val[],int wt[],int n,int W){
    int dp[] [] = new int[val.length+1][W+1];
    for(int i = 0;i<n+1;i++){
       dp[i][0] = 0;
    }
    for(int j = 0;j<W+1;j++){
        dp[0][j] = 0;
     
   }
   for(int i = 1;){
    { if(wt[i]<j){

    }
        dp[i][j] = Math.max(dp[i][j-wt[i-1]],dp[i-1][j])
    }
   }
   } 

    public static void main(String[] args) {
        int  nums[] = {4,2,7,1,3};
        int target = 20;
        System.out.println(target(nums,target));
    }
}