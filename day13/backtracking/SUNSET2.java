public class SUNSET2 {
    public static void subset(String str,int i,String ans){
    
//base case
if(i==str.length()){
    if(ans.length()==0){
        System.out.println("null");
    }
    else{
        System.out.println(ans);      
    }
    return;
}
      //recursion and char
        //yes choice
        subset(str, i+1, ans+str.charAt(i));//add that char into the ans
        //no choice
        subset(str, i+1, ans);//nothing will be add
    }
    public static void main(String[] args) {
        subset("abc", 0, "" );
    }
}
