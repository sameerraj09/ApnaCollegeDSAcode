public class binarytodec {
    public static void convert(int n){
     
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
        int n =101;
        convert(n);
    }
}
