/**************************
Fill the matrix like LCS, then traverse back from dp[m][n]
if corr chars are equal, so add them to ans once else need to add them seperately
Input: str1 = "abac", str2 = "cab"
Output: "cabac"
***************************/

class Solution {
    public String shortestCommonSupersequence(String X, String Y) {
        int m=X.length();
        int n=Y.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;
            }
        }
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(X.charAt(i-1)==Y.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=(int)Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        String ans="";
        int x=m,y=n;
        while(x>0 && y>0)
        {
            if(X.charAt(x-1)==Y.charAt(y-1))
            {
                ans=X.charAt(x-1)+ans;
                x--;y--;
            }
            else
            {
                if(dp[x][y-1]>dp[x-1][y])
                {
                    ans=Y.charAt(y-1)+ans;
                   y--; 
                } 
                else
                {
                    ans=X.charAt(x-1)+ans;
                    x--;
                }
            }
        }
        while(x>0)
        {
            ans=X.charAt(x-1)+ans;x--;
        }
        while(y>0)
        {
            ans=Y.charAt(y-1)+ans;y--;
        }
        return ans;
        
    }
}
