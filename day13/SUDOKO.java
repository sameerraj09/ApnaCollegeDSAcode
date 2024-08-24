public class SUDOKO {
    public static void printSudoko(int sudoko[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoko[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean issafe(int sudoko[][], int row, int col, int digit) {
        // col
        for (int i = 0; i <= 8; i++) {
            if (sudoko[i][col] == digit) {
                return false; // checking down side
            }
        }
        // row
        for (int j = 0; j <= 8; j++) {
            if (sudoko[row][j] == digit) { // checking the side values in same row
                return false;
            }
        }
        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3; // adjusting to the starting index of the sub-grid
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoko[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokosolver(int sudoko[][], int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }
        // recursion
        int nextRow = row, nextcol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextcol = 0;
        }
        if (sudoko[row][col] != 0) { // already number is there
            return sudokosolver(sudoko, nextRow, nextcol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (issafe(sudoko, row, col, digit)) {
                sudoko[row][col] = digit;
                if (sudokosolver(sudoko, nextRow, nextcol)) {// soln exist
                    return true;
                }
                sudoko[row][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int sudoko[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 }, 
                           { 4, 9, 0, 1, 5, 7, 0, 0, 2 }, 
                           { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                           { 1, 8, 5, 0, 6, 0, 0, 2, 0 }, 
                           { 0, 0, 0, 0, 2, 0, 0, 6, 0 }, 
                           { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                           { 0, 3, 0, 0, 7, 2, 0, 0, 4 }, 
                           { 0, 4, 9, 0, 3, 0, 0, 5, 7 }, 
                           { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
        if (sudokosolver(sudoko, 0, 0)) {
            System.out.println("soln exist");
            printSudoko(sudoko);
        } else {
            System.out.println("soln not exist");
        }
    }
}
