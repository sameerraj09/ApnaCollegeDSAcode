public class lcs2 {
    
        public static int lcs(String s1, String s2, int m, int n, int count) {
            if (m == 0 || n == 0) {
                return count;
            }
            if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
                count = lcs(s1, s2, m - 1, n - 1, count + 1);
            }
            return Math.max(count, Math.max(lcs(s1, s2, m - 1, n, 0), lcs(s1, s2, m, n - 1, 0)));
        }
    
   
    public static int lcs1(String s1,String s2){
        int m =s1.length()-1;
        int n =s1.length()-1;
        int dp[][] = new int[m+1][n+1];
        for(int i = 0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        //initialization of base case for tabulation
        for(int i =0;i<m+1;i++){
            dp[i][0] = 0;
        }
        for(int j = 0;j<n+1;j++){
            dp[0][j]=0;
        }
        int ans = 0;
        for(int i = 1;i<m+1;i++){
            for(int j= 1;j<n+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                      ans = Math.max(ans, dp[i][j]);
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(lcs1("sameer", "ameer"));
        
    }
}
