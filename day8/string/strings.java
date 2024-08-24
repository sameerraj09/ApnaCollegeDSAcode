import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char arr[]={'a','b','c','d','e'};
        String str ="abcd";
        String str1 = new String("xyz");
        String name;
        name = sc.next();//take onlyone word
        System.out.println(name);
        String fullname;
        fullname=sc.nextLine();//take full line or sentence
        System.out.println(fullname);
    }
}
