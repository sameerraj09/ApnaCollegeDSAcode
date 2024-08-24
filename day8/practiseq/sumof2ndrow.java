import java.util.*;
public class sumof2ndrow {
    public static void matrixsum(int matrix[][]) {
        int sum =0;
       for(int j =0;j<matrix[0].length;j++){
        sum+=matrix[1][j];
       }
       System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        matrixsum(arr);
        sc.close(); // close the scanner to prevent resource leak
    }
}

