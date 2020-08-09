/*****************
it would be same as number of deletions we do...
min deletion , so max length of palindromic string
so make Y=Reverse(X)
find lcs, then deletion or insertion=total len-lcs length

Input: s = "mbadm"
Output: 2
Explanation: String can be "mbdadbm" or "mdbabdm".
******************/


class Solution {
    public int minInsertions(String X) {
       
        String Y="";
        for(int i=0;i<X.length();i++)
        {
            Y=X.charAt(i)+Y;
        }
         //   System.out.print(Y+"     lllll");
        int m=X.length();
        int n=m;
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
        return m-dp[m][n];
        
    }
}
