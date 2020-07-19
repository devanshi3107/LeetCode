/**************************
Given a string = "23", so possible combinations need to be obtained as the alphabets on phone for any digit
output=["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
*****************************************/



class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<String>();
        if(digits==null || digits.length()==0)
            return result;
        
        String mapping[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            letterCombinationRecursive(result,digits,"",0,mapping);
        return result;
            
    }
    public void letterCombinationRecursive(List<String> result,String digits,String current,int index,String[] mapping)
    {
        if(index==digits.length())
        {
            result.add(current);
            return;
        }
        String letters=mapping[digits.charAt(index)-'0'];
        for(int i = 0;i < letters.length();i++)
        {
            letterCombinationRecursive(result,digits,current+letters.charAt(i),index+1,mapping);
        }
    }
}
