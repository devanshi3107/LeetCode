/**************
To be done in O(n) time with no extra space
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]

*****************/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> mlist = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i]) - 1;  // we are doing math.abs , since we are making elements as negative
            if(nums[index] < 0)  // so it means a duplicate element already made this changes
             mlist.add(Math.abs(nums[i]));
            
            nums[index] = -nums[index];
        }
        return mlist;
        
    }
}
