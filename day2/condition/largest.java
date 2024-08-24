import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first no\n");
        int a = sc.nextInt();
        System.out.println("enter the second no \n");
        int b = sc.nextInt();
        System.out.println("enter the third no \n");
        int c = sc.nextInt();
        if(a>b && a>c){
           
                 System.out.println("A IS THE GREATEST NO"+a);

        }
        else if(b>a && b>c){
            
                System.out.println("C IS THE GREATEST NO"+c);
            }
        else{
            System.out.println("c is the greatest no \n"+c);
        }
    }
}
