public class invertedpyramid {
    public static void main(String[] args){
        int count = 1;
        for(int i =0;i<4;i++){
            
            for(int k = 0;k<=i;k++){
            System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
