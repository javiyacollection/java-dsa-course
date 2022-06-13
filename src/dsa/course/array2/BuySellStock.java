package dsa.course.array2;

public class BuySellStock {
    public static void main(String[] args) {
        BuySellStock buySellStock=new BuySellStock();
        System.out.println("Maximum profit is: " + buySellStock.printMaxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println("Maximum profit is: " + buySellStock.maxProfitII(new int[]{7,1,5,3,6,4}));

    }

    public int printMaxProfit(int[] a) {
        int max=Integer.MIN_VALUE;
        int maxProfit=0;
        for(int i=a.length-1; i>=0;i--){
            max=Math.max(max, a[i]);
            maxProfit= Math.max(maxProfit, max-a[i]);
        }
        return maxProfit;
    }

    public int maxProfitII(int[] a) {
        int profit=0;
        for(int i=1; i<a.length;i++){
            if(a[i]-a[i-1]>0){
                profit+=a[i]-a[i-1];
            }

        }
        return profit;
    }
}
