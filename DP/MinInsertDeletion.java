/********************
x="heap"
y="pea"
so min no of insertion deletion that would convert string x to y
find lcs, because that would be same, 
now m-lcs=no of char that are removes from A
n-lcs=no of char that are added to A to make it B
ans=(m-lcs)+(n-lcs)
********************/
class Solution {
    public int minDistance(String X, String Y) {
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
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return (m-dp[m][n])+(n-dp[m][n]);
    }
}
