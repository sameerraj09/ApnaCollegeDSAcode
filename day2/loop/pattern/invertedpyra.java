import java.util.Scanner;

public class invertedpyra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int i,j,k;
        int rows = scanner.nextInt();
        for (i = 1; i <= rows; i++)   
    {  
        for (j = i; j < rows; j++)  //for i =5 no star will print for 4 1 start and so on
        {  
            System.out.print(" ");   
        }  
        for ( k = 1; k <= i; k++)  
        {  
            System.out.print("*"); // print the Star  
        }  
        System.out.println();  

    }
}
}