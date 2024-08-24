import java.lang.reflect.Array;
import java.util.Arrays;

public class anagrams {
    
    public static void main(String[] args) {
        String str1 = "earth2";
        String str2 = "heart";
        str1 = str1.toLowerCase();
        str2 =str2.toLowerCase();
        if(str1.length()==str2.length()){
            char[] strarr1=str1.toCharArray();
            char[] strarr2=str2.toCharArray();
            Arrays.sort(strarr1);
            Arrays.sort(strarr2);
            boolean result = Arrays.equals(strarr1, strarr2);
            if(result){
                System.out.println("anagrams");
            }
            
        }
        else{
            System.out.println("not a anagrams");
        }
        
    }
}
