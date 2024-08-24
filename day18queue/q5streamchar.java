import java.util.*;

public class q5streamchar {
    public static void printnonrepeating(String str){
       int freq[]=new int[26];
       Queue <Character>  q= new LinkedList<>();
       
       for(int i =0;i<str.length();i++){
           char ch =str.charAt(i);
           q.add(ch); // element ko queue mein daalo
           freq[ch-'a']++; // ab uss character ki frequency ko badhao
           
           // ab condition check karo
           while(!q.isEmpty() && freq[q.peek()-'a']>1){     
               q.remove(); // jab tak queue khali nahi hoti aur queue ki peek ki frequency 1 se jyada hai, tab tak uss element ko queue se remove karo
           }
           
           // do cases ho sakte hain - ya to queue khali ho jayegi ya frequency ki value 1 hogi
           if(q.isEmpty()){
               System.out.println("-1");
           }
           else{
               System.out.println(q.peek() + " ");
           }
           System.out.println();
       }
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        printnonrepeating(str);
    }
}
