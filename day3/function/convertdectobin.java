public class convertdectobin {
    public static void convertdectobin(int n){
    
        int pow = 0;
        int bin=0;
        int remainder = 0;
        while(n!=0){
          remainder = n%2;
                bin = bin+(remainder*(int)Math.pow(10, pow));
            
            pow++;
            n/=2;
        }
        System.out.println(bin);
    }
    public static void convertbintodec(int n){
     
        int pow = 0;
            double decno = 0;
            int lastdigit = 0;
        while(n!=0){
            
            lastdigit = n%10;
            decno = decno+lastdigit*(Math.pow(2,pow));
            n/=10;
            pow++;
        }
        System.out.println(decno);
    }
    public static void main(String[] args) {
        int n =5;
        convertbintodec(101);
        convertdectobin(5);
    }
}
