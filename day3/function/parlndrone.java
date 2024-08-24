public class parlndrone {
    public static void parlidrone(int n){
        int lastdigit;
        int orignalno = n;
        int reversedno=0;
        while(n!=0){
           lastdigit=n%10;
           reversedno=lastdigit+(reversedno*10);
            n/=10;
           
        }
    if(orignalno==reversedno){
        System.out.println("given no is parldrome");;
    
    }
    else{
        System.out.println("not a parlidrone\n");
    }
    }
    public static void main(String[] args) {
        parlidrone(121);
        int absoluteValue = Math.abs(-10);
        System.out.println(absoluteValue);
    }
}
