public class climbingstairs {
    public static void main(String[] args) {
        int n = 5;
        int result = ways(n);
        System.out.println(result);
        int dp[] = new int[n+1];
        int result2 = way1(n, dp);
        int result3= way2(n);
        System.out.println(result2);
        System.out.println(result3);
        }
    public static int ways(int n){
        if(n==0){
            return 1;
        }
        if(n<1){
            return 0;
        }
        return ways(n-1) +ways(n-2);
    }
    public static int way1(int n ,int dp[]){
        if(n==0){
            return 1;
        }
        if(n<1){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n] = way1(n-1,dp) +way1(n-2,dp);
      //  dp[n] = way1(n-1) +ways(n-2);
        return dp[n];
    }

    public static int way2(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;

        for(int i = 1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];  
            }
            else{

            
    dp[i]=dp[i-1]+dp[i-2];
            }

        }
        return dp[n];
    }
}
