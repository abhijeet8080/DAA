public class knapsack{
    public static void main(String[]args) {
        int []profit = {10,15,40};
        int []weights = {1,2,3};
        int capacity = 6;
        int n = profit.length;
        int [][] dp = knapsack(profit,weights,capacity,n);
        printobjects(dp,profit,weights,n,capacity);
    }
    public static int[][] knapsack(int[]profit,int []weights,int capacity,int n){
        int[][] dp = new int[n+1][capacity+1];
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=capacity;j++) {
                if(i==0 || j==0) {
                    dp[i][j] = 0;
                }
                else if(weights[i-1]<=j) {
                    dp[i][j] =  Math.max((profit[i-1]+dp[i-1][(j-weights[i-1])]), dp[i-1][j]);
                }
                else {
                    dp[i][j]= dp[i-1][j];
                }
            }
        }

        return dp;
    }
    public static void printobjects(int[][] dp,int[] profit,int[]weights,int n,int capacity) {
        int sum=dp[n][capacity];
        for(int i=n;i>0 && capacity>0;i--) {

            if(dp[i][capacity]!=dp[i-1][capacity]) {
                System.out.println("Item "+i+" Value = "+profit[i-1]+", Weight = "+weights[i-1]);
                capacity -= weights[i-1];
            }
        }
        System.out.println("Total value: "+sum);
    }
}