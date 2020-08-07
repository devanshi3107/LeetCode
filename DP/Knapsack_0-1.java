import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    //  static int max(int a, int b) 
    // { 
    //     return (a > b) ? a : b; 
    // } 
	public static void main (String[] args) {
	    Scanner S = new Scanner(System.in);
	    int t=S.nextInt();
	    while(t>0)
	    {
	        int n=S.nextInt();
	        int W= S.nextInt();
	        int val[]=new int[n];
	        int wt[] = new int[n];
	        for(int i=0;i<n;i++)
	        val[i]=S.nextInt();
	        for(int i=0;i<n;i++)
	        wt[i]=S.nextInt();
	        
	        int dp[][]=new int[n+1][W+1];
	        for(int i=0;i<n+1;i++)
	        {
	            for(int j=0;j<W+1;j++)
	            {
	                if(i==0 || j==0)
	                dp[i][j]=0;
	            }
	        }
	        for(int i=1;i<n+1;i++)
	        {
	            for(int j=1;j<W+1;j++)
	            {
	                if(wt[i-1]<=j)
	                {
	                    dp[i][j]=Math.max((val[i-1]+dp[i-1][j-wt[i-1]]),dp[i-1][j]);
	                }
	                else
	                dp[i][j]=(dp[i-1][j]);
	            }
	        }
	        System.out.println(dp[n][W]);
	        t--;
	       
	    }
		
	}
}
