import java.util.Scanner;

public class sumevenodd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        for(int i = 0;i<=n;i++){
    if(i%2==0){
        evensum=evensum+i;
    }
    else{
        oddsum=oddsum+i;
    }
        }
        System.out.println("even sum = "+evensum);
        System.out.println("odd sum = "+oddsum);
    }
}
