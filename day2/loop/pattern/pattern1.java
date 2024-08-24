public class pattern1 {
    public static void main(String[] args) {
        // for(int i = 1;i<=4;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    int i = 0;
        while(i<=4){
            int j = 0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
