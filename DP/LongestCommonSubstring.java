/****************
Similar to lcs
X="abcde"
Y="abz"
so common substring="ab"
whenever there is a mismatch make 
dp[i][j]=0
and in the end return the max value which is present in the entie matrix
*************/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		    int m=13;
		    int n=9;
		    String X="geeksforgeeks";
		    String Y="geeksquiz";
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
		            dp[i][j]=0;
		        }
		    }
		    int max=Integer.MIN_VALUE;;
		    for(int i=0;i<m+1;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            if(dp[i][j]>max)
		            max=dp[i][j];
		        }
		    }
		    System.out.println(max);
		    
		}
	}
