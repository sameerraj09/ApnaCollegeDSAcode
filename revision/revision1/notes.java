import java.util.*;
public class notes {
    //500 100 50 20 10 1
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    int f5 = 0;
    int hud = 0;
    int fif = 0;
    int ten = 0;
    int one = 0;
    
    if (amount>=500) {
        f5=amount/500;
        amount -=f5*500;
    }   
        

     if (amount>=100) {
         hud=amount/100;
        amount -=hud*100;
            
            
    }
     if (amount>=50) {
         fif=amount/50;
        amount -=fif*50;
            
            
    }
     if (amount>=10) {
         ten=amount/10;
        amount -=ten*10;
            
            
    }
     if (amount>=1) {
         one=amount;
       // amount -=one*1;
            
            
    }
    System.out.println("No fo 500 notes required ="+f5);
    System.out.println("No fo 100 notes required ="+hud);
    System.out.println("No fo 50 notes required ="+fif);
    System.out.println("No fo 10 notes required ="+ten);
    System.out.println("No fo one notes required ="+one);
}
}