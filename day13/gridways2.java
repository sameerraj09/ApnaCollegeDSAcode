public class gridways2 {
    public static int gridways(int i,int j,int n,int m){
        if(i==n-1 &&j==m-1){//condn for last cell//base case
            return 1;
        }
        else if(i==n||j==n){
            return 0;//boundary condition
        }

   int w1 = gridways(i+1, j, n, m);//down
   int w2 = gridways(i, j+1, n, m);// right
   return w1+w2;
    }
    public static void main(String[] args) {
        int n =3;
        int m=3;
        System.out.println(gridways(0, 0, n, m));

    }
}
