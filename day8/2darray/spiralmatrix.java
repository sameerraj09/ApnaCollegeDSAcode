import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        int arr[][]=new int [4][4];
        Scanner sc = new Scanner(System.in);
        //input
        for(int i =0;i<4;i++){
            for(int j = 0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<=endRow;i++){
            for(int j =0;j<=endcol;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int startRow = 0;
        int startcol = 0;
        int endRow = arr.length-1;
        int endcol = arr[0].length-1;
        while(startRow<=endRow && startcol<=endcol){
            //top make variable coulmn value
            for(int j =startcol;j<=endcol;j++){
                System.out.print(arr[startRow][j]+" ");
            }
            ///right make variable row value
            for(int i =startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endcol]+" ");
            }
            //buttom
            for(int j =endcol-1;j>=startcol;j--){
                if(startRow==endRow){
                    break;            }
                System.out.print(arr[endRow][j]+" ");
            }
            ///left make variable row value
            for(int i =endRow-1;i>=startRow+1;i--){
                if(startcol==endcol){
                    break; }
                System.out.print(arr[i][startcol]+" ");
            }
            startRow++;
            endRow--;
            startcol++;
            endcol--;
        }

        }
    }

