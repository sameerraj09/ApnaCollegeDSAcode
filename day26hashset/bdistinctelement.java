import java.util.HashSet;

public class bdistinctelement {
    public static int count(int arr[]){
        HashSet<Integer> js = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            js.add(arr[i]);
        }
        return js.size();
    }
    public static void main(String[] args) {
        int arr[]  = {4,3,2,5,6,7,3,4,2,1};
        System.out.println(count(arr));

    }
}
