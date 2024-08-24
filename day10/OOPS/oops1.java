public class oops1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();  //creating object
        p1.setcolor("yelow"); //calling function
        p1.settip(4); 
        System.out.println(p1.color); //printing atributes
        System.out.println(p1.tip);        
    }
}
class Pen{  //blue print //creating class
//prop function 
String color;   //atributes
int tip;
void setcolor(String newcolor){   //function
    color =newcolor;
}
void settip(int newtip){
    tip =newtip;
}
}
class student{
    String name;
    int age;
    float percentage;
    void calpercentage(int phy,int chem,int Math){
        percentage=(phy +Math+chem)/3;
    }
}
