/******************************
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]
*******************************/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> mlist = new ArrayList<>();
       for(int i : nums)
       {
           int index=Math.abs(i)-1;
           if(nums[index]<0)
               mlist.add(Math.abs(nums[i]));
           
           
               
       }
        
    }
}
