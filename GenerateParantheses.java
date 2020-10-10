/***************************************************
given n=3
o/p- 
["((()))","(()())","(())()","()(())","()()()"]


*************************************************/
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
         helper(ans,"",0,0,n);
        return ans;
        
    }
    public void helper(List<String> ans, String brackets, int open, int close, int max)
    {
        if(brackets.length() == 2*max)
        {ans.add(brackets);
        return;}
        
        if(close < open)
            helper(ans,brackets+")",open,close+1,max);
        
        if(open <max)
            helper(ans,brackets+"(",open+1,close,max);
        
       // return ans;
    }
}
