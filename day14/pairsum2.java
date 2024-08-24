public class pairsum2 {
    public static boolean pair(ArrayList<Integer> list,int target){
        int pivot =0;
        for(int i =1;i<list.size();i++){
            if (list.get(i-1)>list.get(i)){
             pivot = i;
             break;
            }
        }
        int start = pivot;
        int end = pivot-1;
        while(start<list.size() &&end>=0 && start!=end){
            int sum = list.get(start)+list.get(end);
    if(target ==sum){
        return true;
    }
    else if(sum>target){
        end--;
    }
    else{
        start++;
    }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 30;
        System.out.println(pair(list, target));
        
    }
}
