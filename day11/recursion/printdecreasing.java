public class printdecreasing {
    public static void print(int n){
        if(n==1){//base case
            System.out.println(n);
            return;
        }
        System.out.println(n);//defining the work
        print(n-1);//call inner function
    }
    public static void main(String[] args) {
        int n =10;
        print(n);
    }
}
