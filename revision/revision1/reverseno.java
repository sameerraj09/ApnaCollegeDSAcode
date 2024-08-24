public class reverseno {
    public static void main(String[] args) {
        int n = 235;
        int reversedno=0;
        while(n<0){
            
            int digit = n%10;
             reversedno=reversedno*10+digit;
             n/=10;
        }
    }
  

}
