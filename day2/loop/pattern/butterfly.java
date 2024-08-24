public class butterfly {
    public static void main(String[] args) {
        int n =4;
        for(int i=1;i<=n;i++){   //upper half
            for(int j =1;j<=i;j++){
                System.out.print("*");//for first row ith start
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");//after that 6 start for the first line
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");//last star for the ith line
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){   //reverse the outer loop for the outer loop
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
