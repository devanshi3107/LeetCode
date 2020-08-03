/**********************
Input: "A man, a plan, a canal: Panama"
Output: true
*********************/

class Solution {
    public boolean isPalindrome(String s) {
       s= s.toLowerCase();
        String s1="",s2="";
        char ch;
        for(int x=0;x<s.length();x++)
        {
            ch=s.charAt(x);
            if(Character.isLetter(ch) || Character.isDigit(ch))
            {
            s1=s1+ch;
            s2=ch+s2;
            }
        }
        if(s1.equals(s2))
        return true;
        else
            return false;
        
    }
}
