public class printsum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int summ1=sum(n-1);
        int sum =n+summ1;
        return sum;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(sum(n));
    }
}
