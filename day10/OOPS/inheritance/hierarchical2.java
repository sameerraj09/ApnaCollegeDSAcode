public class hierarchical2 {
    
        public static void main(String[] args) {
            Dog d1 = new Dog();
            d1.eat();//calling parent class function 
            d1.bark();
            fish f1 = new fish();
            f1.eat();//calling parent class function 
            f1.swim();
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
    class fish extends Animal{ //1st deriverd class
    void swim(){
        System.out.println("swim in water");
    }
    }
    class Dog extends Animal{ //2nd deriverd class
    void bark(){
        System.out.println("dog's bark");
    }
    }
    
