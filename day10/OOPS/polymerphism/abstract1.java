public class abstract1 {
    public static void main(String[] args) {
       horse h1 =new horse();
       chicken c1 = new chicken();
       h1.eat();
       h1.walk();//calling abstract
       c1.eat();
       c1.walk(); 
    }
}
abstract class animal{
    void eat(){
        System.out.println("eat");
    }
    abstract void walk();//not defining
}
class horse extends animal{
void walk(){
    System.out.println("walks on 4 leg");//define abstract function inside the sub class
}
}
class chicken extends animal{
   void walk(){
    System.out.println("walk on two leg");//define abstract function inside the sub class
   } 
}