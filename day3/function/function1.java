import java.util.Scanner;
public class function1 {
    public static void printhellow(){
        System.out.println("hello world");
        System.out.println("hello world");    
    }
    public static int sum(int a ,int b){
        return a+b;

    }
    
    public static void main(String[] args) {
        printhellow();
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
       int sum =  sum(a,b);
       System.out.println(sum);
    }
}
