package week4;


import java.util.Scanner;

public class stocks {
    public static int findProfit(int[] prices){
        int buyday=0;
        int sellday=0;
        int maxProfit=0;
        int lowestprice=prices[0];
        for (int i =0;i<prices.length;i++)
        {
            if (prices[i]<lowestprice)
            {
                lowestprice=prices[i];
                buyday=i;
            }
            int profit = prices[i]-lowestprice;
            if (profit>maxProfit)
            {
                maxProfit=profit;
                sellday=i;
            }
        }
        System.out.println("BUY STOCKS ON "+(buyday+1));
        System.out.println("PRICE AT"+prices[buyday]);
        System.out.println("SELL STOCKS ON "+(sellday+1));
        System.out.println("PRICE AT"+prices[sellday]);
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] prices={2,7,3,5,4,1,2};
        System.out.println("MAX PROFIT:+"+findProfit(prices));
    }

}
