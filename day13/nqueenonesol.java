public class nqueenonesol {
        public static void print(char board[][]) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    
        public static boolean issafe(char board[][], int row, int col) {
            // Check vertical up
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][col] == 'Q') {
                    return false;
                }
            }
    
            // Check diagonal left
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
    
            // Check diagonal right
            for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
            return true;
        }
    static int count = 0;//to count no of ways
        public static boolean nqueen(int row, char board[][]) {
            if (board.length == row) {
                return true;
            }
            for (int j = 0; j < board.length; j++) {
             if (issafe(board, row, j)) {
                    board[row][j] = 'Q';
                  if(nqueen(row + 1, board)){
                    return true;
                  }
                    board[row][j] = '*'; // removing the queen from their position
               }
            }
            return false;
        }
    
        public static void main(String[] args) {
            int n = 4; // Change the value of n as per your requirement
            char board[][] = new char[n][n];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    board[i][j] = '.';
                }
            }
            if(nqueen(0, board)){
                System.out.println("solution exist");
                print(board);
            }
            else{
                System.out.println("soln not exist");
            }
    
        }
    }
    


