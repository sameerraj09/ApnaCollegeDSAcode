import java.util.*;
public class pair {
public static void pairprint(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=1;j<i;j++){
            System.out.print(arr[i]);
            System.out.print(arr[j]);
            System.out.println();
        }

    }
}
    public static void main(String[] args){
int arr[]={2,4,6,8,10};
pairprint(arr);
    }
}
