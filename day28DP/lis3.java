import java.util.Arrays;
import java.util.HashSet;

public class lis3 {
    // Method to find the length of the longest increasing subsequence
    public static int lis(int arr1[]) {
        // Use a HashSet to remove duplicates
        HashSet<Integer> hs = new HashSet<>();
        for (int num : arr1) {
            hs.add(num);
        }
        
        // Convert the HashSet to an array
        int arr2[] = new int[hs.size()];
        int i = 0;
        for (int num : hs) {
            arr2[i] = num;
            i++;
        }
        
        // Sort the array to create the target increasing subsequence
        Arrays.sort(arr2);
        
        // Find the length of the longest common subsequence between arr1 and arr2
        return lcs(arr1, arr2);
    }

    // Method to find the longest common subsequence between two arrays
    public static int lcs(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        
        // Create a 2D array for dynamic programming
        int dp[][] = new int[m + 1][n + 1];

        // Initialization of base case for tabulation
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 0;
        }

        // Fill the dp array using the LCS dynamic programming approach
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        
        // The length of the longest common subsequence is found in dp[m][n]
        return dp[m][n];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, -1, 2, 3, 4, 5};   
        
        // Print the length of the longest increasing subsequence
        System.out.println(lis(arr));
    }
}
