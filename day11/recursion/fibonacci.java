public class fibonacci {
  public static int fibonacii(int n ){
   if(n==1 || n==0){
        return n;
    }
    int fibnm1 =fibonacii(n-1);
    int fibnm2 = fibonacii(n-2);
    int fibn=fibnm1+fibnm2;
    return fibn; 
    
// return fibonacii(n-1)+fibonacii(n-2);
  }  
  public static void main(String[] args) {
    int n=6;
    System.out.println(fibonacii(n));
  }
}
