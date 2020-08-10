class Solution {
    public int superEggDrop(int e, int f) {
        int dp[][]=new int[e+1][f+1];
        int res;
        int i,j,k;
        for(i=1;i<=e;i++)
        {
            dp[i][1]=1;   // if floor->1, so attempts req->1
            dp[i][0]=0;  // if floor->0,so eggs attempts ->0
        }
        for(j=1;j<=f;j++)
        {
            dp[1][j]=j;    //if egg is 1, so attempts=no of floors
        }
        for(i=2;i<e+1;i++)
        {
            for(j=2;j<f+1;j++)
            {
                dp[i][j]=Integer.MAX_VALUE;
                for(k=1;k<=j;k++)
                {
                    res=1+Math.max(dp[i-1][k-1],dp[i][j-k]);
                    if(res<dp[i][j])
                        dp[i][j]=res;
                }
            }
        }
        return dp[e][f];
        
    }
}
