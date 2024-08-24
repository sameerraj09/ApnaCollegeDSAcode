public class stringconversion2 {

    // Function to compute the Longest Common Subsequence (LCS) of two strings
    public static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m + 1][n + 1];
        
        // Initialize the first row and first column to 0
        for (int i = 0; i < m + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < n + 1; j++) { // Corrected this line to iterate over n + 1
            dp[0][j] = 0;
        }

        // Fill the DP table
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; // Characters match, extend the LCS
                } else {
                    int ans1 = dp[i][j - 1]; // Exclude current character of s2
                    int ans2 = dp[i - 1][j]; // Exclude current character of s1
                    dp[i][j] = Math.max(ans1, ans2); // Take the maximum of the two options
                }
            }
        }
        return dp[m][n]; // Return the length of the LCS
    }

    // Function to compute the minimum number of insertions and deletions required
    public static int conv(int lcs, String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Calculate the number of deletions required
        int remove = m - lcs;
        // Calculate the number of insertions required
        int add = n - lcs;
        
        // Total operations is the sum of deletions and insertions
        return remove + add;
    }

    public static void main(String[] args) {
        String s1 = "pear";
        String s2 = "sea";
        
        // Find the LCS of the two strings
        int lcsLength = lcs(s1, s2);
        // Calculate the minimum number of insertions and deletions required
        int result = conv(lcsLength, s1, s2);
        
        // Print the result
        System.out.println(result); // Output: 3
    }
}
