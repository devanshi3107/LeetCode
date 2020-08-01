/****************************************
Input: "USA"
Output: True
Input: "FlaG"
Output: False
Input: "g"
Output: True
Input: "gggggggggggggg"
Output: True
***********************************************/

class Solution {
    public boolean detectCapitalUse(String word) {
        char ch;
        int c=0;
        if(word.length()==1)
            return true;
        for(int i=0;i<word.length();i++)
        {
            ch=word.charAt(i);
            if(Character.isUpperCase(ch))
                c++;
        }
        if(c==word.length() || c==0)
            return true;
        else if(c==1 && Character.isUpperCase(word.charAt(0)))
            return true;
        else
            return false;
        
    }
}
