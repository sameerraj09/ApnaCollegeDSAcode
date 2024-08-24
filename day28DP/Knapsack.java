public class Knapsack {
   // Recursive approach to solve the knapsack problem
   public static int knapsack(int val[], int wt[], int W, int n) {
      if (W == 0 || n == 0) { // Base case: no capacity or no items left
         return 0;
      }
      if (wt[n-1] <= W) { // If the weight of the nth item is less than or equal to the capacity
         // Include the nth item and recur for remaining items with reduced capacity
         int ans1 = val[n-1] + knapsack(val, wt, W - wt[n-1], n - 1);
         // Exclude the nth item and recur for remaining items
         int ans2 = knapsack(val, wt, W, n - 1);
         // Return the maximum value obtained by including or excluding the nth item
         return Math.max(ans1, ans2);
      } else {
         // If the weight of the nth item is greater than the capacity, exclude it
         return knapsack(val, wt, W, n - 1);
      }
   }

   // Memoized approach to solve the knapsack problem
   public static int knapsack1(int val[], int wt[], int W, int n, int dp[][]) {
      if (W == 0 || n == 0) { // Base case: no capacity or no items left
         return 0;
      }

      if (dp[n][W] != -1) { // If the subproblem is already solved, return the stored value
         return dp[n][W];
      }
      if (wt[n-1] <= W) { // If the weight of the nth item is less than or equal to the capacity
         // Include the nth item and recur for remaining items with reduced capacity
         int ans1 = val[n-1] + knapsack1(val, wt, W - wt[n-1], n - 1, dp);
         // Exclude the nth item and recur for remaining items
         int ans2 = knapsack1(val, wt, W, n - 1, dp);
         // Store the maximum value obtained by including or excluding the nth item
         dp[n][W] = Math.max(ans1, ans2);
         return dp[n][W];
      } else {
         // If the weight of the nth item is greater than the capacity, exclude it
         dp[n][W] = knapsack1(val, wt, W, n - 1, dp);
         return dp[n][W];
      }
   }

   // Tabulation approach to solve the knapsack problem
   public static int knapsack2(int[] val, int wt[], int W) {
      int dp[][] = new int[val.length + 1][W + 1]; // DP array to store results of subproblems
      for (int i = 0; i < val.length + 1; i++) {
         dp[i][0] = 0; // Initialize first column (capacity 0) to 0
      }
      for (int j = 0; j < W + 1; j++) {
         dp[0][j] = 0; // Initialize first row (no items) to 0
      }
      for (int i = 1; i < val.length + 1; i++) {
         for (int j = 1; j < W + 1; j++) {
            int v = val[i-1]; // Value of the ith item
            int w = wt[i-1]; // Weight of the ith item
            if (j >= w) { // If current capacity can include the ith item
               int incprofit = v + dp[i-1][j-w]; // Include the item
               int excprofit = dp[i-1][j]; // Exclude the item
               dp[i][j] = Math.max(incprofit, excprofit); // Take the maximum of including and excluding
            } else {
               // If current capacity cannot include the ith item, exclude it
               int exclude = dp[i-1][j];
               dp[i][j] = exclude;
            }
         }
      }
      for(int i =0;i<val.length+1;i++){
         for(int j = 0;j<W+1;j++){
            System.out.print(dp[i][j]+" ");
         }
         System.out.println();
      }
      return dp[val.length][W]; // Return the maximum value for the given capacity and items
   }
   public static int knapsack3(int[] val, int wt[], int W) {
      int dp[][] = new int[val.length + 1][W + 1]; // DP array to store results of subproblems
      for (int i = 0; i < val.length + 1; i++) {
         dp[i][0] = 0; // Initialize first column (capacity 0) to 0
      }
      for (int j = 0; j < W + 1; j++) {
         dp[0][j] = 0; // Initialize first row (no items) to 0
      }
      for (int i = 1; i < val.length + 1; i++) {
         for (int j = 1; j < W + 1; j++) {
            int v = val[i-1]; // Value of the ith item
            int w = wt[i-1]; // Weight of the ith item
            if (j >= w) { // If current capacity can include the ith item
               int incprofit = v + dp[i][j-w]; // Include the item
               //only one change all will be same using that item also to fill the bag
               int excprofit = dp[i-1][j]; // Exclude the item
               dp[i][j] = Math.max(incprofit, excprofit); // Take the maximum of including and excluding
            } else {
               // If current capacity cannot include the ith item, exclude it
               int exclude = dp[i-1][j];
               dp[i][j] = exclude;
            }
         }
      }
      for(int i =0;i<val.length+1;i++){   
         for(int j = 0;j<W+1;j++){
            System.out.print(dp[i][j]+" ");
         }
         System.out.println();
      }
      return dp[val.length][W]; // Return the maximum value for the given capacity and items
   }

   public static void main(String[] args) {
      int val[] = {15, 14, 10, 45, 30}; // Values of the items
      int wt[] = {2, 5, 1, 3, 4}; // Weights of the items
      int W = 7; // Maximum capacity of the knapsack
      int dp[][] = new int[val.length + 1][W + 1]; // DP array for memoization

      // Initialize DP array with -1 for memoization
      for (int i = 0; i < dp.length; i++) {
         for (int j = 0; j < dp[0].length; j++) {
            dp[i][j] = -1;
         }
      }

      // Print results of different knapsack approachesA
      System.out.println(knapsack(val, wt, W, val.length)); // Recursive approach
      System.out.println(knapsack1(val, wt, W, val.length, dp)); // Memoized approach
      System.out.println(knapsack2(val, wt, W)); // Tabulation approach
      System.out.println(knapsack3(val, wt, W)); //unbounded knapsack
   }
}
