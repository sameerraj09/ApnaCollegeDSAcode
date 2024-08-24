import java.util.*;
import java.util.Scanner;
public class arraybasic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();//taking the ip
        }
        for(int i = 0;i<10;i++){
            System.out.print(arr[i]);
        }
        arr[2]=10;//updation
        System.out.println();
        for(int i = 0;i<10;i++){
            System.out.print(arr[i]);
        }
    }
}
