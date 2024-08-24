public class permutation3 {
    public static void permutaion(String str,String ans){
    
//base case
if(i==str.length()){
   
        System.out.println(ans);      
    }
    return;
}
for(int i =0;i<str.length;i++){
    char curr = str.charAt(i);
    //abcde    
}
      //recursion and char
        // choice
        permutaion();//add that char into the ans
        //no choice
        subset(str, i+1, ans);//nothing will be add
    }
    public static void main(String[] args) {
        String str = "abde";
        subset("abc", 0, "" );
    }
}