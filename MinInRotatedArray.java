/***************
A[]={3,4,5,1,2}
output=1

*************/
class Solution {
    public int findMin(int[] nums) {
      //  int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
                return nums[i+1];
                
        }
        return nums[0];
    }
}
