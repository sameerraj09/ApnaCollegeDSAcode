public class copysunstructor6 {
    public static void main(String[] args) {
        pen p1 = new pen("ballpen", 4);
        pen p2 = new pen(p1); // calling copy constructor
        p1.price = 20;
        p2.price = 30;
        System.out.println(p1.price); // 20
        System.out.println(p1.name);  // ballpen
        System.out.println(p1.type);  // 4
        System.out.println(p2.price); // 30
        System.out.println(p2.name);  // ballpen (copied)
        System.out.println(p2.type);  // 4 (copied)
    }
}

class pen {
    public String name;
    public int type;
    public int price;
   
    pen(String name, int type) {
        this.name = name;
        this.type = type;
    }

    pen(pen p1) { // copy constructor
        this.name = p1.name; // copy name
        this.type = p1.type; // copy type
        this.price = p1.price; // copy price
    }
}
