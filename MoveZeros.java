/******************
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

*****************************/

class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int temp;
        for(int i=0;i<nums.length;i++)   // 010   100
        {
            if(nums[i]!=0)  // 1>0
            {
        temp = nums[count];  // temp = 0
        nums[count] = nums[i]; //  0<--1
        nums[i] = temp;         // 1<--0
        count = count + 1;    //count =1
            
    }
    }
}
}
