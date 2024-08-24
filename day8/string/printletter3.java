public class printletter3 {
    public static void print(String str){
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String fullname ="Sameer";
        print(fullname);
    }
}
