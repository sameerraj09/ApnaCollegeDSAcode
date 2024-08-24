import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int reversedno = 0;
        // while(n!=0){
        //     int lastdigit = n%10;
        //     System.out.print(lastdigit);
        //     n/=10;
        // }   printing reverse no
        while(n!=0){
            int no=n%10;
            reversedno = reversedno*10+no;
            n/=10;
        }
        System.out.println(reversedno);//reversing the no
       
    }
    
}
