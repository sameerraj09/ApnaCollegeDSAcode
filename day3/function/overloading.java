public class overloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static float sum(float a,float b,float c){
        return a+b+c;
    }
    public static void main(String[] args) {
      int a =  sum(2,3);
       int b =  sum(2,3,4);//overloading using number of data
       float c = sum(2.2f, 3.1f, 1.7f);//overloading using data types
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
    }
}

