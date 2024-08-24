public class stock {
    public static void stock(int price[]) {
        int buyingprice=Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i =0;i<price.length;i++){
            if(buyingprice<price[i]){
int profit=price[i]-buyingprice;
maxprofit=Math.max(maxprofit, profit);
            }
           
        else{
            buyingprice=price[i];
        }
        }
        System.out.println(maxprofit);
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,2,10};
        stock(arr);
    }
}
