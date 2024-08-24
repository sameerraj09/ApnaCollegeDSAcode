public class even {
    public static void main(String[] args) {
        int num = 7;
        
            int lastdigit=num & 1;
            if(lastdigit==0){
                System.out.println("even no");
            }
            else{
                System.out.println("not a even no");
            }
        
    }
}
