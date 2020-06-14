/*******************
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
(Kandane Algorithm)
********************/

class Solution {
    public int maxSubArray(int[] nums) {
         int size = nums.length; 
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for(int i=0;i<size;i++)
        {
            max_ending_here= max_ending_here+nums[i];
            if(max_ending_here>max_so_far)
                max_so_far=max_ending_here;
            if (max_ending_here < 0) 
                max_ending_here = 0; 
        }
        return max_so_far; 
    }
}



