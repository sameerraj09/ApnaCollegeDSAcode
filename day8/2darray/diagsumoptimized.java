import java.util.*;
public class diagsumoptimized {
        public static void main(String[] args) {
        
        int arr[][]=new int [4][4];
        Scanner sc = new Scanner(System.in);
        //input
        for(int i =0;i<4;i++){
            for(int j = 0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<4;i++){
            for(int j =0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum =0;
       
        for(int i =0;i<arr.length;i++){
            sum+=arr[i][i];//pd
            if(i!=arr.length-1-i)//for odd inot equal to j
            sum+=arr[i][arr.length-1-i];
          
         }
         System.out.println(sum);
         
            }                    
    }



