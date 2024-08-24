public class rangeprime {
    public static boolean checkIsPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
  public static void printprime(int start,int end){
    for(int i =start;i<end;i++){
        if(checkIsPrime(i)){
            System.out.println(i);
        }
    }
  }
  public static void main(String[] args) {
    printprime(10,20);
  }
}
