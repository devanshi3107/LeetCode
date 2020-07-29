/*****************
Input: "abcabcbb"
Output: 3 
**********************/
class Solution {
    public int lengthOfLongestSubstring(String s) {
       int start=0,end=0;
        int max=0;
        HashSet<Character> hset = new HashSet<>();
    
        while(end<s.length())
        {
            if(!hset.contains(s.charAt(end)))
            {hset.add(s.charAt(end));
                end++;
                max=Math.max(max,end-start);  // or end-start=hset.size()
                
            }
            else
            {
                hset.remove(s.charAt(start));
                start++;
                
            }
        }
        return max;
        
    }
}
