public class overriding {
    public static void main(String[] args) {
        dear d1 =new dear();
        d1.eat();//give op of derived class
    }
}
    class animal{
        void eat(){
            System.out.println("eat nything");
        }
    }

class dear extends animal{
    void eat(){//overriding
        System.out.println("eats grass");
    }
}
