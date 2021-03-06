class Solution {
    public int maxSubArray(int[] nums) {
     int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;
        for(int i=0;i<nums.length;i++)
        {
            max_ending_here=max_ending_here+nums[i];
            max_so_far=Math.max(max_ending_here,max_so_far);
            if(max_ending_here<0)
                max_ending_here=0;
        }
        return max_so_far;
    }
}
