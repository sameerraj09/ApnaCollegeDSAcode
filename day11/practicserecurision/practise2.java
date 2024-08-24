public class practise2 {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printword(int n){
        if(n==0){
return;
        }
        int lastdigit = n%10;
        printword(n/10);
        System.out.print(digits[lastdigit]+" ");
        }
      public static void main(String[] args) {
        printword(223);
      }  
    }
