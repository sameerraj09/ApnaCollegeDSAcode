public class powerof2 {
    public static void main(String[] args) {
        int n = 15;
        int result = n & n-1;
        if(result == 0)
        {
            System.out.println(n+"is power of two");
        }
        else{
            System.out.println(n+"is not power of two");
        }
    }
}
