public class prinascending {
  
        public static void print(int n){
            if(n==1){//base case
                System.out.println(n);
                return;
            }
            
            print(n-1);//call inner function
            System.out.println(n);//defining the work
        }
        public static void main(String[] args) {
            int n =10;
            print(n);
        }
    }

