public class acessmodifier2 {
    public static void main(String[] args) {
        Bankacount b1 = new Bankacount();
        b1.username="sameer";
    b1.setpassword("123");
    System.out.println(b1.username); 
    }
   


}
class Bankacount{
    public String username;
    private String password;///not access outside the class
    public void setpassword(String pwd){ //password can be set outside the class
        password=pwd;//setting the password
    } 

}
