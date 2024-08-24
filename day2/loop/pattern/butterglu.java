public class butterglu {
    public static void main(String[] args) {
       for(int i = 1;i<=8;i++){
        for(int j = 0;j<=8;j++){
            if(i==1 || i==8 || j==4 ||j==5){
                System.out.print("*");
            }
            System.out.println();
        }
       }
}
}