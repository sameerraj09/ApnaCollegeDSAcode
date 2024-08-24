public class wildcard {
    public static boolean wildcard(String text, String pattern) {
        int m = text.length();
        int n = pattern.length();
        boolean[][] dp = new boolean[m + 1][n + 1];

        // "*" means any number of characters can be matched or no character at all
        // "?" means any one character can be replaced

        // Initialize dp array
        dp[0][0] = true; // No text and no pattern

        // Case 1: If we don't have anything in the pattern j=0, then we will not get any match, always false
        // By default dp[i][0] = false, so no need to set it explicitly

        // Case 2: Now we have nothing in the text (i=0) and we have to match it to pattern
        // It is also false but in one case it will be true if pattern consists only of '*'
        for (int j = 1; j < n + 1; j++) {
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // Fill the dp array
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (pattern.charAt(j - 1) == '*') {
                    // '*' can match zero or more characters
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (pattern.charAt(j - 1) == '?' || text.charAt(i - 1) == pattern.charAt(j - 1)) {
                    // '?' can match any one character or exact match of characters
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String text = "baaabab";
        String pattern = "***ba***ab";
        System.out.println(wildcard(text, pattern));
    }
}
