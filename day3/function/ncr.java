public class ncr {
             public static int fact(int n){
            int fact  =1 ;
            for(int i = 1;i<=n;i++){
                fact = fact*i;
            }
            return fact;
        }

public static void npr(int n,int r){
    int n1 = fact(n);
    int nr = fact(n-r);
    int ans = n1/nr;
    System.out.println(ans);
}    
    public static void main(String[] args) {
        npr(3,2);
    }
}