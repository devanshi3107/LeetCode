class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i : nums)
        {
            if(!hmap.containsKey(i))
                hmap.put(i,1);
            else
                return true;
        }
        return false;
        
    }
}
