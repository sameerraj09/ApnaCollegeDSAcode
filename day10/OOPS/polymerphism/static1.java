public class static1 {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    s1.schooname="MKD";//assigning value to static
    System.out.println(s2.schooname);//printing the vlaue of s2 with the help of static
  }  
}
class Student{
    static int returnpercent(int phy,int chem,int math){  //created only once
        return (math+phy+chem)/3;
    }
    String name;
    int roll;
    static String schooname;//declaring
}

