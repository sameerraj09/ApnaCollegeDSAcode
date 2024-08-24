public class lcs {
    public static int lcs(String s1,String s2,int n,int m){
        if(n==0 ||m==0){  //if any one of the string become 
            return 0;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
           return 1+ lcs(s1, s2, n-1, m-1);
        }
        else{ //not same
         int ans1 = lcs(s1, s2, n-1, m); 
         int ans2 = lcs(s1, s2, n, m-1);
         return Math.max(ans1, ans2); 
        }
    }
   
        public static int lcs1(String s1,String s2,int n,int m){
            if(n==0 ||m==0){  //if any one of the string become 
                return 0;
            }
            int dp [][] = new int[n+1][m+1];
            for(int i = 0;i<dp.length;i++){
                for(int j = 0;j<dp[0].length;j++){
                    dp[i][j] = -1;
                }
            }
            if(dp[n][m]!=-1){
                return dp[n][m];
            }
            if(s1.charAt(n-1)==s2.charAt(m-1)){
               int result = 1+ lcs(s1, s2, n-1, m-1);
               dp[n][m] = result;
               return dp[n][m];
            }
            else{ //not same
             int ans1 = lcs(s1, s2, n-1, m); 
             int ans2 = lcs(s1, s2, n, m-1);
            int result =  Math.max(ans1, ans2);
            dp[n][m]=result;
            return dp[n][m];
             
            }
        }
        public static int lcs2(String s1,String s2,int n,int m){
       
         //table creation and initializaiton of 1st row and 1st coulmn with zero(by default)
            int dp [][] = new int[n+1][m+1];
           
           for(int i = 1;i<n+1;i++){
            for(int j=1;i<m+1;j++){
            
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                   dp[i][j]=dp[i-1][j-1]+1;
            }
            else{ //not same
                int ans1 = dp[i-1][j];
                int ans2 = dp[i][j-1];
               dp[i][j] =  Math.max(ans1, ans2);
           }
           
            }
            
           
           
             
            }
            return dp[n][m];
        }
       
        
    
    
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
       System.out.println(lcs(s1, s2, s1.length(), s2.length()));
       System.out.println(lcs1(s1, s2, s1.length(), s2.length()));
       System.out.println(lcs2(s1, s2, 0, 0));
    }
    
}
