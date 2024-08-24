import java.util.Scanner;

public class nooflement {
    public static void countOccurrences(int matrix[][], int key) {
        int row = 0;
        int count = 0;
        int col = matrix[0].length - 1; // targeting the 1st row and last column element
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                count++;
               
                //System.out.println("element found");
            } else if (key < matrix[row][col]) { // if key is small go to left
                col--;
            } else { // if key is greater go to down
                row++;
            }
        }
        System.out.println(count);
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
        System.out.println("Enter the key to count occurrences:");
        int key = sc.nextInt();
        countOccurrences(arr, key);
        sc.close(); // close the scanner to prevent resource leak
    }
}
