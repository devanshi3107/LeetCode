class Solution {
    public int[] dailyTemperatures(int[] T) {
        int n=T.length;
        int[] ans = new int[n];
        
        Stack<Integer> abc = new Stack<>();
        abc.push(0);
        
        for(int i=0;i<n;i++)
        {
            while(!abc.isEmpty() && T[i]>T[abc.peek()])
            {
                int x=abc.peek();
                ans[x]=i-x;
                abc.pop();
            }
           abc.push(i);     
        }
        return ans;
        
    }
}
