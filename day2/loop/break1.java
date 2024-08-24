import java.util.Scanner;

public class break1 {
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    // for(int i = 0;i<10000;i++){
    //     int n = sc.nextInt();
    //     if(n%10==0){
    //         break;
    //     }
    // }
    // System.out.println("user enter the multiple of 10");
    // while(true){
    //     int n =sc.nextInt();
    //     if(n%10==0){
    //         break;
    //     }
    // }
    // System.out.println("user enter the multiple of 10");
    do{
        
            int n =sc.nextInt();
            if(n%10==0){
                break;
            }
        }while(true);
        System.out.println("user enter the multiple of 10");
    

}
}
  

