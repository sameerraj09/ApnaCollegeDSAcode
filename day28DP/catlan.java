import java.util.Arrays;

public class catlan {

    // Recursive approach to calculate Catalan number
    public static int catlan(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += catlan(i) * catlan(n - i - 1);
        }
        return ans;
    }

    // Memoization approach to calculate Catalan number
    public static int catlan1(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += catlan1(i, dp) * catlan1(n - i - 1, dp);
        }
        return dp[n] = ans;
    }

    // Dynamic Programming approach to calculate Catalan number
    public static int catlan2(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);

        // Printing the Catalan number using different approaches
        System.out.println(catlan(n)); // Recursive approach
        System.out.println(catlan1(n, arr)); // Memoization approach
        System.out.println(catlan2(n)); // Dynamic Programming approach
    }
}
