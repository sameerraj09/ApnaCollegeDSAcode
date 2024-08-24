public class printxpowern {
    public static int calcpow(int x ,int n){
        if(n==1){
            return x;
        }
        if(n==0){
            return 1;
        }
        // int xnm1=power(x,n-1);
        // int xn = x*xnm1;
        // return xn;
        return x*calcpow(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(calcpow(2, 3));
    }
}
