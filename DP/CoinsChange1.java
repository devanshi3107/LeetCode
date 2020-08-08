/*******************************
Input: coins = [1, 2, 5], 
amount = 11
Output: 3 
Ques of unbounded knapsack with slight variation, here we'll be filling row as well 

*****************************/

class Solution {
    public int coinChange(int[] coins, int amount) {
         int n=coins.length;
        int dp[][]= new int[n+1][amount+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<amount+1;j++)
            {
                if(i==0)
                    dp[i][j]=Integer.MAX_VALUE-1;
                if(j==0)
                    dp[i][j]=0;
            }
        }
        for(int i=1,j=1;j<amount+1;j++)
        {
            if(j%coins[0]==0)
                dp[i][j]=j/coins[0];
            else
                dp[i][j]=Integer.MAX_VALUE-1;   // as we need to get the min no of coins
        }
        for(int i=2;i<n+1;i++)
        {
            for(int j=1;j<amount+1;j++)
            {
                if(coins[i-1]<=j)
                    dp[i][j]=Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);   // adding 1 since we have picked up that coin.
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        if(dp[n][amount]==Integer.MAX_VALUE-1)    //if we can't get any coin for the req sum, so we have to return -1
            return -1;
        else return dp[n][amount];
            
        
    }
}
