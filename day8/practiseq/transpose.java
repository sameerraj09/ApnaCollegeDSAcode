public class transpose {
    public static void transpose(int matrix[][]){
        int row =matrix.length;
        int coulmn=matrix[0].length;
        int transpose[][]=new int[coulmn][row];
        for(int i =0; i<coulmn;i++){
            for(int j =0;j<row;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        for(int i =0;i<transpose.length;i++){
            for(int j =0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    
    }
    public static void main(String[] args) {
        int arr[][]={{2,3,7},{5,6,7}};
        transpose(arr);
    }
}
