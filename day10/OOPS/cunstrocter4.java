public class cunstrocter4 {
    public static void main(String[] args) {
     Pen p1 = new Pen("Ball pen");//passing name value along with the obj
     System.out.println(p1.name);   
    }
}
class Pen{
    int size;
    String name;
    Pen(String name){  //creating constructor and initializing with name
        this.name = name;
        System.out.println("constructor is called");
    }
}
