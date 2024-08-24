public class editdist {
    public static int edit(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m + 1][n + 1];
        
        // Initialization of DP table
        // Base case: if s2 is empty, all characters of s1 must be deleted
        // Base case: if s1 is empty, all characters of s2 must be added
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0) dp[i][j] = j; // If s1 is empty, insert all characters of s2
                if (j == 0) dp[i][j] = i; // If s2 is empty, delete all characters of s1
            }
        }
        // for(int j = 0;j<n+1;j++){
        //     //s1 is empty insert all element of the s2 one by one
        //     dp[0][j]=j;
        // }
        
        // for(int i = 0;i<n+1;i++){
        //     //s1 is empty insert all element of the s2 one by one
        //     dp[i][0]=i;
        // }
        
        // Fill the DP table
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // Characters match, no operation needed
                } else {
                    // Add a character
                    // Example: s1 = "ab", s2 = "abc" -> add 'c' to s1
                    int add = dp[i][j - 1] + 1;
                    
                    // Delete a character
                    // Example: s1 = "abc", s2 = "ab" -> delete 'c' from s1
                    int delete = dp[i - 1][j] + 1;
                    
                    // Replace a character
                    // Example: s1 = "abc", s2 = "adc" -> replace 'b' in s1 with 'd'
                    int replace = dp[i - 1][j - 1] + 1;
                    
                    dp[i][j] = Math.min(replace, Math.min(add, delete)); // Take the minimum of the three operations
                }
            }
        }
        
        // Print the DP table for visualization
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        
        return dp[m][n]; // The edit distance is in the bottom-right cell of the table
    }

    public static void main(String[] args) {
        String s1 = "intention";
        String s2 = "Execution";
        System.out.println("Edit Distance: " + edit(s1, s2));
    }
}
