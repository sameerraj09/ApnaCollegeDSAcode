public class gridwayoptimize {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
public static int gridways(int n ,int m){
    int num =  fact(n+m-2);
    int den = fact(n-1) *fact(m-1);
    return num/den; //calculating permutation for the no
}
public static void main(String[] args) {
    int  n =3;
    int m = 3;
    System.out.println(gridways(n,m));
}
}
