import java.util.ArrayList;
public class pairsum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
       System.out.println(pairsum(list, 3));
    }       
public static boolean pairsum(ArrayList<Integer> list,int target){
    int start = 0;
    int end = list.size()-1;
    while(start<end){
        if(target == list.get(start)+list.get(end)){
            return true;
                }
                else if(target<list.get(start)+list.get(end)){
                   end--;
                }
                else{
                    start++;
                }              
    }
    return false;   
}       
    }

