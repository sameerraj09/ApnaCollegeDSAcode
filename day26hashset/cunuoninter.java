import java.util.*;
public class cunuoninter {
    public static Integer[] union(int arr1[],int arr2[]){
    HashSet<Integer> hs = new HashSet<>();
    for(int i = 0 ;i<arr1.length;i++){
        hs.add(arr1[i]);
    }
    for(int i = 0 ;i<arr2.length;i++){
        hs.add(arr2[i]);
    }
    return hs.toArray(new Integer[0]);
    }
    public static Integer[] intresection(int arr1[],int arr2[]){
        HashSet<Integer> hs1 = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ;i<arr1.length;i++){
            hs1.add(arr1[i]);
        } 
        HashSet<Integer> hs2 = new HashSet<>();
    for(int i = 0 ;i<arr2.length;i++){
        hs2.add(arr2[i]);
    }
    for(int i : hs1){
        if(hs2.contains(i)){
            ans.add(i);
        }
    }
    return ans.toArray(new Integer[0]);
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        Integer[] result = union(arr1, arr2);
        System.out.println("Union of the two arrays:");
        for (Integer num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        Integer[] result1 = intresection(arr1, arr2);
        System.out.println("intersection of the two arrays:");
        for (Integer num1 : result1) {
            System.out.print(num1 + " ");
        }
    }
    
}
