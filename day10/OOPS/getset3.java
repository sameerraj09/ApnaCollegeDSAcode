public class getset3 {
    public static void main(String[] args) {
      Pen p1 =new Pen();
      p1.setcolor("black");
      p1.settip(5);
      System.out.println(p1.getcolor());
      System.out.println(p1.gettip());  
    }
}
class Pen{
   private String color;
   private int tip;
   public void setcolor(String color){
    this.color = color;
   }
   public void settip(int tip){
    this.tip = tip;
   }
   public String getcolor(){
    return color;
   }
   public int gettip(){
    return tip;
   }
}
