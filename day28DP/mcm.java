public class mcm {

    public static int mcm(int arr[], int i, int j) {
        if (i == j)
            return 0; // Only one matrix, no multiplication needed

        int ans = Integer.MAX_VALUE;

        // Corrected loop bounds and condition
        for (int k = i; k < j; k++) {
            int cost1 = mcm(arr, i, k);
            int cost2 = mcm(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalcost = cost1 + cost2 + cost3;

            // Use Math.min to minimize the cost
            ans = Math.min(finalcost, ans);
        }
        return ans;
    }

    // in memoization we have to create a dp and then we have to check whether it is
    // already calc or not
    // if calc then return the value if not then calc and store it
    public static int mcm1(int arr[], int i, int j, int dp[][]) {

        if (i == j)
            return 0; // Only one matrix, no multiplication needed
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;

        // Corrected loop bounds and condition
        for (int k = i; k < j; k++) {
            int cost1 = mcm(arr, i, k);
            int cost2 = mcm(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalcost = cost1 + cost2 + cost3;

            // Use Math.min to minimize the cost
            ans = Math.min(finalcost, ans);
            dp[i][j] = ans;
        }
        return dp[i][j];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        int n = arr.length;
        int dp[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                dp[i][j] = -1;
            }
        }
        int i = 1; // Corrected index to start from 1
        int j = arr.length - 1; // Corrected to arr.length - 1
        System.out.println(mcm(arr, i, j));
        System.out.println(mcm1(arr, i, j, dp));
    }
}
