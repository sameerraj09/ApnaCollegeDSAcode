public class staircaseserach {
    public static boolean staircase(int matrix[][],int key){
int row=0;
int col = matrix[0].length-1;//targetting the 1st row and last coulmn elemet
while(row<matrix.length &&col>=0){
    if(matrix[row][col]==key){
        System.out.println("found key at ("+row+","+col+")");
       return true;
    
    }
    else if(key<matrix[row][col]){//if key is small go to left
        col--;
       
    }
    else{//if key is greater go to down
        row++;
    }      
}
return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {50,60,70,80},
                        {12,13,14,15},
                         {19,21,23,25}};
    
 staircase(matrix,60);
}
}

