public class CUNSTROCTORTYPE5 {
    public static void main(String[] args) {
        pen p1 =new pen();//calling the non parametarized cunstrocter
        pen p2 =new pen("black");//calling the parametarized cunstrocter
        pen p3 = new pen(4);
    }

}
class pen{
   private String name;
   private int type;
    pen(){
        System.out.println("this is non parameterized cunstrocter");
    }
    pen(String name){
        this.name = name;
        System.out.println("this is parameterized constructor");
    }
    pen(int type){
        this.type = type;
    }
}
