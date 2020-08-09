/*****************
Given S="aabcbcdd"
so string---"aabbdd"
its repeating so output=3
******************/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{	    
	        int n=8;
		    int m=n;
		    int dp[][]=new int[m+1][n+1];
		    String X="aabebcdd";
		    String Y=X;
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
		            if(X.charAt(i-1)==Y.charAt(j-1) && i!=j)
		            dp[i][j]=dp[i-1][j-1]+1;
		            else
		            dp[i][j]=(int)Math.max(dp[i-1][j],dp[i][j-1]);
		        }
		    }
		    System.out.println(dp[m][n]);
		   
		
	}
}
