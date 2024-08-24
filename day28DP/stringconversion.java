public class stringconversion {
    public static int conv(String s1, String s2) {

        //convert string 1 to string 2 by using only two operation add and delete
        // Initialization
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m + 1][n + 1];

        // Base case initialization
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0) {
                    dp[i][j] = j; // If s1 is empty, we need to add each character of s2
                }
                if (j == 0) {
                    dp[i][j] = i; // If s2 is empty, we need to delete each character of s1
                }
            }
        }

        // Fill the DP table
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // No action needed, characters match
                } else {
                    int delete = dp[i - 1][j] + 1; // Delete a character from s1
                    int insert = dp[i][j - 1] + 1; // Insert a character into s1
                    dp[i][j] = Math.min(delete, insert); // Take the minimum of the two operations
                }
            }
        }

        return dp[m][n]; // The minimum number of insertions and deletions required
    }

    public static void main(String[] args) {
        String s1 = "pear";
        String s2 = "sea";
        System.out.println(conv(s1, s2)); // Output: 2
    }
}
