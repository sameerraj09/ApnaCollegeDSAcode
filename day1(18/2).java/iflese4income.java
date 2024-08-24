import java.util.Scanner;

public class iflese4income {
   public static void main(String[] args) {
    float amount;
    Scanner sc = new Scanner(System.in);
    float n = sc.nextFloat();
    if (n < 500000) {
        amount = 0;
    } else if (n >= 500000 && n < 1000000) {
        amount = n*0.2f;
    } else {
        amount = n*0.3f;
    }
    System.out.println(amount);
}
}
