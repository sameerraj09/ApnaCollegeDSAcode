public class leap {
    public static void main(String[] args) {
        int n = sc.nextInt();
        if(n%4==0 && n%100!=0 ||year%400==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
