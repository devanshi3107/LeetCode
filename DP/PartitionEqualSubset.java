/****************************************
Input: [1, 5, 11, 5]

Output: true

Explanation: The array can be partitioned as [1, 5, 5] and [11].
***********************************************/
class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum=sum+nums[i];
        
        if(sum%2!=0)  // if sum is odd, we cannot have partitions-like 23/2 there can't be 11.5 as sum of any subset so reject this part 
            return false;
        else
            return subsetSum(nums,(int)sum/2);  // so if sum is even like 22,, so the subset sum would be 11 - 11 and 
            //hence if we find a subset with 11 as sum, other subset will also have sum as 11, hence it reduces to subset sum problem with sum as sum/2
        
    }
    public boolean subsetSum(int[] nums,int sum)  // this is sum of subset problem
    {
        boolean dp[][] = new boolean[nums.length+1][sum+1];
        int n=nums.length;
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(i==0)                           // 1st row as false
                    dp[i][j]=false;
                if(j==0)
                    dp[i][j]=true;                   // 1st collumn as true
                    
            }
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                if(nums[i-1]<=j)
                    dp[i][j]=dp[i-1][j-nums[i-1]] || dp[i-1][j];        
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}

