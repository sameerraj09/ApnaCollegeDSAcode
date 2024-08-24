import java.util.*;
public class stack4revstring {
public static void main(String[] args) {
 Stack <Character>  s= new Stack<>();
    Scanner sc = new Scanner(System.in);
    String str =sc.next();
    for(int i =0;i<str.length();i++){
        s.push(str.charAt(i));
    }
    while(!s.empty()){
        System.out.print(s.pop());
    }
}
}
