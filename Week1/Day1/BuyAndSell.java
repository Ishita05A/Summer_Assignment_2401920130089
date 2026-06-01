package Week1.Day1;

public class BuyAndSell {
    static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i = 1;i<prices.length;i++){
            profit = Math.max(profit,prices[i]-buy);
            buy = Math.min(buy,prices[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    
}
