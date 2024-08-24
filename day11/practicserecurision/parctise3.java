public class parctise3 {
    public static int lenstr(String str,int i){
        if(i>=str.length()){
            return 0;
        }
        return 1+lenstr(str, i+1);  
    }
    public static void main(String[] args) {
        String str ="sameer";
       System.out.println(lenstr(str, 0)); 
    }
}
