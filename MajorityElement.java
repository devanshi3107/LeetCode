/****************
element which occurs more than n/2 times in the given array, where n is no. of elements in the array.
**********************************/
import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        if(nums.length==1)
            return nums[0];
        int x;
        for(x=0;x<nums.length;x++)
        {
            if(hmap.containsKey(nums[x]) && hmap.get(nums[x]) + 1 > n/2) {
                return nums[x];}
           else if(hmap.containsKey(nums[x]))
                hmap.put(nums[x],hmap.get(nums[x])+1);
            else
                hmap.put(nums[x],1);
        }
        return -1;
        
    }
}
