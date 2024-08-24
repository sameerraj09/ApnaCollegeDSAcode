import java.util.ArrayList;
import java.util.Arrays;

public class GFG {
    

    //print without consecutive values
public static int length(String str,int i){
    if(i==str.length()){
        return i;
    }
    return length(str, i+1);
}
  
    public static void main(String[] args) {
    String str = "samee";
    System.out.println(length(str, 0));
    }
    }
