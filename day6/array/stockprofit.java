public class stockprofit {
   public static int maxprofit(int prices[]){
   // int sellday =0;
    //int buyday=0;
    int buyprice =Integer.MAX_VALUE;
    int maxprofit = 0;
    for(int i= 0;i<prices.length;i++){
       if(buyprice<prices[i]){//profit
int profit = prices[i]-buyprice;
//sellday=i+1;
maxprofit=Math.max(maxprofit, profit);
       } 
       else{
        buyprice=prices[i];//not good for sale loss
     //   buyday=i+1;
       }
    }
   // System.out.println("buy stock on "+buyday+"day");
    //System.out.println("sell stock on "+sellday+"day");
    return maxprofit;
   } 
   public static void main(String[] args) {
    int arr[]={2,8,3,6};
    int profit=maxprofit(arr);
    System.out.println(profit);
   }
}
