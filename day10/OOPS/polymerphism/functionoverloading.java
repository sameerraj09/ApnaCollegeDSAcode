public class functionoverloading {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        System.out.println(c1.sum(1, 2));       // Calls sum(int, int)
        System.out.println(c1.sum(1, 2, 3));    // Calls sum(int, int, int)
        System.out.println(c1.sum(1.2f, 1.3f)); // Calls sum(float, float)
    }
}

class calculator {
    int sum(int a, int b) {
        return a + b;
    }
    
    float sum(float a, float b) {
        return a + b;
    }
    
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
