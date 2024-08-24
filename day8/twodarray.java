import java.util.Scanner;

public class twodarray {
    public static void search(int arr[][],int key){
        for(int i =0;i<3;i++){
            for(int j = 0;j<3;j++){
                if(key == arr[i][j]){
                    System.out.println("meet at imdex"+i+" "+j);
                }
            }
        }
        //ou
    }
    public static void main(String[] args) {
        int arr[][]=new int [3][3];
        Scanner sc = new Scanner(System.in);
        //input
        for(int i =0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i =0;i<3;i++){
            for(int j = 0;j<3;j++){
        System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        search(arr, 4);
    }
}
