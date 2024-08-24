import java.util.*;

public class diagonalsum {
    public static void main(String[] args) {
        
        int arr[][]=new int [4][4];
        Scanner sc = new Scanner(System.in);
        //input
        for(int i =0;i<4;i++){
            for(int j = 0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<4;i++){
            for(int j =0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int primarydiagsum =0;
        int secondarydiagsum =0;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
         if(i==j){
            primarydiagsum+=arr[i][j];//primary diagonal
         }
        else if(i+j==arr.length-1){
         secondarydiagsum+=arr[i][j];//secondary
         }
         
            }
           
        }
        int sum =primarydiagsum+secondarydiagsum;
        System.out.println(sum);
    }
}
