import java.util.*;
public class updationmark {
    public static void update(int marks[],int nochange){
        nochange =10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int nochange=4;
        int marks[]={94,95,29,40};
        
        update(marks, nochange);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.print(nochange);
    }
}
