public class tilingproblem {
    public static int tilling(int n){//2*n floor size
        //base case
        if(n==0 ||n==1){
            return 1;
        }
//kaam
//vertical choice
int fnm1 = tilling(n-1);
//horizontal choice
int fnm2 = tilling(n-2);
int totalways=fnm1+fnm2;
return totalways;

    }
    public static void main(String[] args) {
     System.out.println(tilling(3));   
    }
}
