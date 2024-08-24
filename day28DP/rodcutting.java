public class rodcutting {
    public static int rodcutting(int len[],int price[],int totrod){
        int n = price.length;
        int dp[][] = new int[n+1][totrod+1];
            for(int i = 0;i<n+1;i++){
                         dp[i][0] = 0;
            }
            
            for(int j = 0;j<totrod+1;j++){
                dp[j][0] = 0;   //initialization
   }

   for(int i = 1;i<n+1;i++){
    for(int j = 1;j<totrod+1;j++){
        if(len[i-1]<=j){ //valid
     dp[i][j] = Math.max(price[i-1]+dp[i][j-len[i-1]], dp[i-1][j]);
        }
        else{
            dp[i][j] = dp[i-1][j];
        }
    }
   }
   for(int i = 0;i<n+1;i++){
    for(int j = 0;j<totrod+1;j++){
        System.out.print(dp[i][j]+" ");
    }
    System.out.println();
   }
   return dp[n][totrod];
        }

        public static void main(String[] args) {
            int length[]={1,2,3,4,5,6,7,8};
            int price[] = {1,5,8,9,10,17,17,20};
            int totrod = 8;
            System.out.println(rodcutting(length, price, totrod));
        }
    }
    

