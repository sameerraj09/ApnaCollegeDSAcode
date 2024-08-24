import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the no which table you want\n");
        Scanner sc =new Scanner(System.in);
        n =sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(n+"*"+i+" = "+n*i);
        }
    }
}
