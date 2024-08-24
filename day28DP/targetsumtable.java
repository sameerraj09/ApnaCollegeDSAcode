public class targetsumtable {
    public static boolean targetsum(boolean dp[][], int sum, int nums[]) {
        // Base case initialization of the table
        // if sum = 0 => true (1st column)
        // if i = 0 & sum > 0 => false (1st row except 1st element)

        for (int i = 0; i < nums.length + 1; i++) {
            dp[i][0] = true; // making all column zero (sum = 0) true
        }

        // Second base case is handled by default (dp[i][j] is false for all i, j initially)

        // Core logic
        for (int i = 1; i < nums.length + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int val = nums[i - 1];
                if (val <= j &&dp[i - 1][j - val]) { // Check if the current value can be included  
                    dp[i][j] = true ;// Include the current element
                }


                else if (dp[i - 1][j]==true) { // Check if the target can be achieved without the current element
                    dp[i][j] = true;
                }
            }
        }
        return dp[nums.length][sum];
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int target = 10;
        boolean dp[][] = new boolean[nums.length + 1][target + 1];
        System.out.println(targetsum(dp, target, nums));
    }
}
