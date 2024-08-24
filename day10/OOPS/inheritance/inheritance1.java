public class inheritance1 {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();//calling parent class function 
        shark.breadth();
        shark.swim();//calling fish class function
        
    }
}
class Animal{     //parent case
    string color;
    void eat(){
        System.out.println("eats");
    }
    void breadth(){
        System.out.println("breadth");
    }
}
class fish extends Animal{  //derived class
    int fins;
    coid swim(){
        System.out.println("swims in water");
    }
}
