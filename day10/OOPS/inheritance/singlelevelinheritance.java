public class singlelevelinheritance {
   
        public static void main(String[] args) {
            Dog d1 = new Dog();
            d1.eat();//calling parent class function 
            d1.legs = 4;//calling derived class
            System.out.println(d1.legs); 
        }
    }
    class Animal{     //parent case
        String color;
        void eat(){ 
            System.out.println("eats");
        }
        void breadth(){
            System.out.println("breadth");
        }
    }
    class Mammals extends Animal{ //1st deriverd class
    int legs;
    }
    class Dog extends Mammals{ //2nd deriverd classA
    String breed;
    }
    

