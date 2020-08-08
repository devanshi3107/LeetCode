/********************************
given arr[]={1,5,6,11}
2 subsets-{1,5,6} and {11} there diff = 1
so o/p= 1
here we know sum of 2 subsets: s1+s2=total sum of array elements 
s1+s2=23
s2=sum-s1    range of subset's sum== 0 (for {} set) and sum--when all elements are there  
we have to find out the possible values between 0 and sum which can be the sum of any subset... so if we see the subset sum problem, the laste row there tells, 
using all elements of the given array, what all can be the possible sum-- so if it is TRUE, then it can be a possible sum!!!
this can be done using subset sum problem:::::::::::::
after that... store all values which can be true... in an arraylist(till sum/2th collumn, as remaining would form sum of s2
and then find min of sum - 2*list(i)
return thi min


******************************/



/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner S= new Scanner(System.in);
		int t=S.nextInt();
		int sum=0;
		
		while(t>0)
		{
		    int n=S.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {arr[i]=S.nextInt();
		    sum=sum+arr[i];
		    }
		    boolean dp[][]=new boolean[n+1][sum+1];
		    for(int i=0;i<n+1;i++)
		    {
		       for(int j=0;j<sum+1;j++)
		       {
		           if(i==0)
		           dp[i][j]=false;
		           if(j==0)
		           dp[i][j]=true;
		       }
		    }
		    for(int i=1;i<n+1;i++)
		    {
		        for(int j=1;j<sum+1;j++)
		        {
		            if(arr[i-1]<=j)
		            dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
		            else
		            dp[i][j]=dp[i-1][j];
		        }
		    }
		   // System.out.println(dp[4][6]+"dfff");
		    List<Integer> mlist=new ArrayList<>();
		    for(int i=0;i<(sum+1)/2;i++)
		    {if(dp[n][i]==true)
		    mlist.add(i);
		    }
		    int min=Integer.MAX_VALUE;
		    for(int i=0;i<mlist.size();i++)
		    {
		      //  System.out.println(mlist.get(i));
		         min=Math.min(min,sum-2*mlist.get(i));
		    }
		   System.out.println(min);
		    t--;
		    
		}
	}
}
