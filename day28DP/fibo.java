public class fibo {
   public static void main(String[] args) {
   int n = 5;
   int [] f = new int[n+1]; //0 by default
 System.out.println(fib(n,f));
 System.out.println(fibtab(5));
   } 
   public static int fib(int n,int[]f){  //o(n)
    if(n==0 ||n==1){
        return n;
    }
    if(f[n]!=0){
        return f[n];  //already calculated
    }
    f[n] =fib(n-1,f) +fib(n-2,f);
    return f[n];
   }
   public static int fibtab(int n){
    int dp[] = new int[n+1];
    dp[0] = 0;
    dp[1] = 1;
    for(int i = 2;i<=n;i++){
        dp[i] = dp[i-1] +dp[i-2];
    }
    return dp[n];

   }
}
