/*************************************

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false


******************************************/



class Solution {
public boolean isIsomorphic(String s, String t) {
    return helper(s,t) && helper(t,s);
}

    
    public boolean helper(String s, String t) {
        HashMap<Character,Character> hmap = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            
               if(hmap.containsKey(s.charAt(i)) && hmap.get(s.charAt(i))!=t.charAt(i))
               {
                  return false;
               }
              
              if(!hmap.containsKey(s.charAt(i)))
               hmap.put(s.charAt(i),t.charAt(i));  // a a               
               
        }
               return true;
        
    }
}
