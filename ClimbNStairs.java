/**************************************************
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

**********************************************************/
class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];  // make it n+1 as we'll have a case for 0th step also
        dp[0]=1; // there is just 1 way to reach step 0
        dp[1]=1; // just 1 way to reach step 1-- from 0th step
         // dp[2]-- can be reached from step 1(climb 1 step) or step 0(2 steps)
            for(int i=2;i<=n;i++)
            {
                dp[i]=dp[i-1]+dp[i-2];
            }
        return dp[n];
    }
}
