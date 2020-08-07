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
