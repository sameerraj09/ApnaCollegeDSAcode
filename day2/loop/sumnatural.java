import java.util.Scanner;

public class sumnatural {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
     int sum =0;
     int counter = 0;
     while(counter<=n){
        sum = sum+counter;
        counter++;
     }
     System.out.println(sum);
    }
}
