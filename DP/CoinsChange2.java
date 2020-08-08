/**********************************
Input: amount = 5, coins = [1, 2, 5]
Output: 4
Explanation: there are four ways to make up the amount:
5=5
5=2+2+1
5=2+1+1+1
5=1+1+1+1+1
This is case of unbounded knapsack as we can take the given coin any number of time
so just one change here
bounded knapsack--
if(..........)
dp[i][j]=dp[i-1][j]+dp[i-1][j-coins[i-1]];
unbounded:
if(..........)
dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
**********************************/

class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]= new int[n+1][amount+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<amount+1;j++)
            {
                if(i==0)
                    dp[i][j]=0;
                if(j==0)
                    dp[i][j]=1;
            }
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<amount+1;j++)
            {
                if(coins[i-1]<=j)
                    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][amount];
        
    }
}
