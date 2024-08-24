public class printfactorial {
    public static int fact(int n){
     if(n==0){
        return 1; //base case
     }
    int fn=n*fact(n-1); //calling the function and defining
     return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
}
