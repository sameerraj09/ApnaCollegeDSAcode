import java.util.*;

public class cmajorityelement {
    public static Integer[] majority(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer,Integer> hm = new TreeMap();
       // Count the frequency of each element
       for (int i = 0; i < arr.length; i++) {
        if (hm.containsKey(arr[i])) {
            hm.put(arr[i], hm.get(arr[i]) + 1);
        } else {
            hm.put(arr[i], 1);
        }
    }
   
        
        int target = arr.length/3;
        Set<Integer> key = hm.keySet();
        for(int i :key){
                if(hm.get(i)>target){
                    ans.add(i);
                }
        }
        return ans.toArray(new Integer[0]);

    }
    public static void main(String[] args) {
        int arr1[] = {1,3,2,5,1,3,1,5,1};
        int arr2[] = {1,2};
        Integer ans[] = majority(arr1);
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        Integer ans1[] = majority(arr2);
        for(int i = 0;i<ans1.length;i++){
            System.out.print(ans1[i]+" ");
        }

    }
}
