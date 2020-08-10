/**************************
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
****************************/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        Arrays.fill(ans,-1);
       // Arrays.fill(ar, 10)
        int l,h;
        l=0;h=nums.length-1;
        int mid;
        while(l<=h)
        {
            mid=l+(int)(h-l)/2;
            if((mid==0 || nums[mid-1]<target) && (nums[mid]==target))
            {  ans[0]=mid;     //first 
                break;
            }
           else if (nums[mid]<target) 
                l=mid+1; 
            else
               h=mid-1;
        }
        
        l=0;h=nums.length-1;
        while(l<=h)
        {
            mid=l+(int)(h-l)/2;   //1
              if ((mid == nums.length - 1 || target < nums[mid + 1]) && nums[mid] == target)
            {
                  ans[1]=mid;
                break;
            }
            else if(nums[mid]<=target)  // this is imp!!!, as [2,7,7] so mid=1 and 7 will be checked with 7 but we have to goto right side
                l=mid+1;
            else
                h=mid-1;
        }
        return ans;
    }
}
