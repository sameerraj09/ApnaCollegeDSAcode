import java.util.*;
public class prime {
   public static void prime(int n){
    int flag = 0;
    for(int i=2;i<=Math. sqrt(n) ;i++){
        if(n%i == 0){
            flag = 1;
        }
        else{
            flag = 0;
        }
    }
    if(flag ==0){
        System.out.println("given no is prime no");
    }

   else{
    System.out.println("given no is not prime");
   }
}
public static void main(String[] args){
    int a =4;
    prime(a);
}
}
