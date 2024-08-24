import java.util.Scanner;

public class switchcal {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int a =sc.nextInt();
    int b = sc.nextInt();
    char c =sc.next().charAt(0);
    int result = 0;
   switch(c){
    case '+': result = a+b;
    break;
   
   case '-':result = a-b;
    break;
   case '*':result = a*b;
   break;
   case '/':result = a/b;
   break;
   case '%':result = a%b;
   break;
   
   default:System.out.println("wrong charecter");
   }
   System.out.println(result); 
}
}
