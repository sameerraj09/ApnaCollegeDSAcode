public class callbyvalue {
    public static void swap(int a ,int b){
        int temp;
        temp =a;
        a=b;
        b= temp;
System.out.println(a);
System.out.println(b);
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        swap(a, b); //call by value only change happen inside the swap function
        System.out.println(a); //no cahnge will be there
        System.out.println(b);
    }
}
