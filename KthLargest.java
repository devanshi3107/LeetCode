/***********************
Input: [3,2,1,5,6,4] and k = 2
Output: 5
In java Priority Queue is min heap by default.



*********************/

class Solution {
    public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
   for(int i=0;i<nums.length;i++)
   {
       pq.add(nums[i]);
       if(pq.size()>k)
           pq.poll();
   }
        return pq.poll();
        
    }
}
