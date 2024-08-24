public class fact {
    public static int fact(int n){
        int fact  =1 ;
        for(int i = 1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args){
      int fact =   fact(3);
      System.out.println(fact);

    }
   }
