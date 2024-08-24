public class getith {
    public static int getith(int no,int i){
   int bitmas =1<<i;
   if((bitmas & no)!=0){//checking there is atleast one 1
    return 1;
   }
   else{
    return 0;
}
    }
    public static int setith(int no,int i){
        int bitmask = 1<<i;
        int result = no|bitmask;
        return result;
    }
    public static int clearith(int no,int i){
        int bitmask = 1<<i;//creating one at the palce of i
        int result = no^bitmask;//1^1 =0; 
        return result;
    } 
    public static int clearibit(int no ,int i){
        int bitmask = ~0 <<i;//making zero at i position and rest all are 1
        int result = bitmask & no;
        return result;
    }
    public static int rangeclearbit(int no,int i,int j){
    int a  = (~0) <<j+1;//making starting bit high(before the j position)
    int b = (1<<i)-1;//making last bit high (after the i posiotion)
    int bitmas = a|b;
    int result = bitmas & no;
    return result;
    }
  public static void main(String[] args) {
    System.out.println(getith(10, 3));
    System.out.println(setith(10, 2));
    System.out.println(clearith(10, 1));
    System.out.println(clearibit(15, 2));
    System.out.println(rangeclearbit(15, 1, 2));
  }  
}
