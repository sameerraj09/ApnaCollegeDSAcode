public class friendpair {
    public static int friendpair(int n){
        if(n==1 || n==2){//base case
            return n;
        }
        //choice
        //single
        // int fnm1=friendpair(n-1);
        // //pair
        // int fnm2=friendpair(n-2);
        // int pairways=(n-1)*fnm2;
        // int totalways=fnm1 +pairways;
        return friendpair(n-1)+n-1*friendpair(n-2);
    }
    public static void main(String[] args) {
       System.out.println(friendpair(3));
    }
}
