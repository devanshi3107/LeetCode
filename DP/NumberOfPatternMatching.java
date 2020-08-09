/***************
Example :
Input: 
S = "abcde"
words = ["a", "bb", "acd", "ace"]
Output: 3
Explanation: There are three words in words that are a subsequence of S: "a", "acd", "ace".
so find lcs for say "acd" and "abcde" = "acd"
hence which is of same length as that of string to be matched so answer++;
********************/


class Solution {
    public int numMatchingSubseq(String X, String[] words) {
        int ans=0;
        for(String Y:words)
        {
            int n=Y.length();
            ans=ans+LCS(X,Y);
        }
        return ans;
    }
    public int LCS(String X,String Y)
    {
        int m=X.length();
        int n=Y.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(i==0||j==0)
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
        if(n==dp[m][n])
            return 1;
        else
            return 0;
    }
}
