import java.util.*;

public class prime {
    public static void main(String[] args) {
        System.out.println("enter the no");
        Scanner sc =new Scanner(System.in);
        int flag = 1;
        int n = sc.nextInt();
        for(int i = 2;i<Math.sqrt(n);i++){
            if(n%i == 0){
                flag = 0;
            }
        }
        if(flag == 1){
            System.out.println("prime no");
        }
        else{
            System.out.println("not a prime no");
        }
    }
}
